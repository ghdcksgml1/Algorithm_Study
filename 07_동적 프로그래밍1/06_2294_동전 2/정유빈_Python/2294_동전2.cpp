#include <iostream>

using namespace std;
int coin[101]; //동전개수 100개
int dp[10001]; //최대가치가 10000
int main() {
    ios::sync_with_stdio(0); //입출력 빠르게
    cin.tie(0);
    cout.tie(0);

    int n, k;
    cin >> n >> k;

    fill(dp, dp + 10001, 100001); //dp 배열 모든 원소에 값 100001 추가
    dp[0] = 0; //첫번째 원소는 0

    for (int i = 1; i <= n; i++) { 
        cin >> coin[i]; //동전을 넣어줌
    }

    for (int i = 1; i <= n; i++) {
        for (int j = coin[i]; j <= k; j++) {
            dp[j] = min(dp[j], dp[j - coin[i]] + 1);
        }
    }

    if (dp[k] == 10001)
        cout << "-1";
    else
        cout << dp[k];

    return 0;
}
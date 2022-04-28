#include <iostream>
#include <vector>
using namespace std;
int dp[100001]; // 홍보 최대 고객 수가 1000명, 1명당 100원이 든다고 가정할 때

int main() {

	ios::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int c, n;
	cin >> c >> n;
	
	vector <pair<int, int>> vt(n); //n개의 수만큼 벡터 생성

	for (int i = 0; i < n; i++) {
		int a, b;
		cin >> a >> b;
		vt[i] = { a,b }; // 비용과 그 비용으로 얻을 수 있는 고객 수
	}

	for (int i = 1; i <= 100000; i++) {
		for (int j = 0; j < n; j++) {
			if (i % vt[j].first == 0) { //나누어 떨어지면
				dp[i] = max(dp[i], i / vt[j].first * vt[j].second);
			}
			if (i - vt[j].first >= 0) { //나누어 떨어지지 않으면
				dp[i] = max(dp[i], dp[i - vt[j].first] + vt[j].second);
			}
		}

		if (c <= dp[i]) { //홍보했을 때 최소 고객이 i를 투자했을 때 최대 고객보다 적으면
			cout << i;
			return 0;
		}
	}

}
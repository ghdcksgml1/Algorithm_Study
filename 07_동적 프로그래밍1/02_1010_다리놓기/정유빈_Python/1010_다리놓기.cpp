#include <iostream>
using namespace std;

int N, a, b;

int dp[31][31];

int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	for (int i = 1; i < 30; i++) {
		dp[1][i] = i; //N이 1이라면 결과값은 M 출력
	}

	for (int i = 2; i < 30; i++) {
		for (int j = i; j < 30; j++) {
			for (int k = j - 1; k >= i - 1; k--)
				dp[i][j] += dp[i - 1][k]; //그 전 다리가 어디 지었는지가 중요
		}
	}

	cin >> N;
	
	for (int i = 0; i < N; i++) {
		cin >> a >> b;
		cout << dp[a][b] < "\n";
	}


}
#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

vector <bool> premium(int m) { // 1부터 정수 m까지 소수 판별 함수(소수면 0, 아니면 1)
	vector <bool> v(m + 1);

	v[0] = 1;
	v[1] = 1;

	for (int i = 2; i <= sqrt(m); i++) {
		if (v[i] == 1){
			continue;
		}
		for (int j = 2 * i; j <= m; j += i) {
			v[j] = 1;
		}
	}
	return v; // 정수 m까지 소수면 0, 아니면 1인 벡터 반환
}

int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int m, n;
	cin >> m >> n;

	vector <bool> vt = premium(n);

	for (int i = m; i <= n; i++) { // 정수 m부터 n까지
		if (vt[i] == 0) { // 소수이면
			cout << i << '\n'; // 출력
		}
	}
}
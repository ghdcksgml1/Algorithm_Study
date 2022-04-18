#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

vector <bool> check(int n) { //소수 구하는 함수 (에라토스테네스의 체)
	vector <bool> v(n+1);
	v[0] = 1;
	v[1] = 1;

	for (int i = 2; i <= sqrt(n); i++) {
		if (v[i] == 1) {
			continue;
		}
		for (int j = 2 * i; j <= n; j += i) {
			v[j] = 1;
		}
	}

	return v;

}
int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int m, n;
	cin >> m >> n;

	vector <bool> v = check(n); // 함수 반환하여 벡터 v에 저장

	vector <int> vt;

	int sum = 0;
	for (int i = m; i <= n; i++) { //소수인것만 따로 벡터 vt에 저장
		if (v[i] == 0) {
			sum += i;
			vt.push_back(i);
		}
	}
	
	if (vt.size() == 0) { //소수가 없으면(벡터 vt의 사이즈가 0이면)
		cout << "-1";
	}
	else {
		cout << sum << "\n"; //소수의 합 출력
		cout << vt[0]; //소수 중 가장 작은 값 출력(정렬 안해도 가장 작은 값이 index 0일 것임)
	}



}
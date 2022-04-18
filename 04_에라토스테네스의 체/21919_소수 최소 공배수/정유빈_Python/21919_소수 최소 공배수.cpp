#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector <bool> premium(long long m) { //m까지 소수 여부 판별해주는 함수(0이면 소수, 1이면 소수 아님)
	vector <bool> v(m + 1);

	v[0] = 1;
	v[1] = 1;

	for (int i = 2; i <= sqrt(m); i++) {
		if (v[i] == 1) {
			continue;
		}
		for (int j = 2*i; j <= m; j+= i) {
			v[j] = 1;
		}
	}
	return v;
}

int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n;
	cin >> n;

	long long* array = new long long[n]; //배열 선언

	for (int i = 0; i < n; i++) {
		cin >> array[i]; //배열 원소 입력
	}

	sort(array, array + n); //배열 정렬해서
	long long m = array[n - 1]; //배열에서 가장 큰 원소 저장

	vector <bool> vt = premium(m); //1부터 배열에서 가장 큰 원소(m)까지 소수면 0, 소수가 아니면 1

	vector <long long> vs;
	for (int i = 0; i < n; i++) {
		if (vt[array[i]] == 0) { // 배열 원소가 소수이면
			vs.push_back(array[i]); //vs 배열에 저장
		}
	}

	if (vs.size() == 0) {
		cout << "-1";
		return 0;
	}

	sort(vs.begin(), vs.end()); //소수가 들어있는 배열을 정렬해서
	vs.erase(unique(vs.begin(), vs.end()), vs.end()); //배열 중복 원소 제거


	//소수들의 최소공배수는 소수들의 곱과 같다
	long long result = 1;
	for (int i = 0; i < vs.size(); i++) {
		result *= vs[i]; // 소수 원소들을 곱함
	}

	cout << result; //최소공배수 출력


}
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;


vector <bool> premium(int n) { //소수 찾는 함수( 소수면 0, 소수 아니면 1인 불리안 함수)

	vector <bool> v(n + 1);
	v[0] = 1;
	v[1] = 1;

	for (int i = 2; i <= sqrt(n); i++) {
		if (v[i] == 1) {
			continue;
		}
		for (int j = 2*i; j <= n; j += i) {
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
	cin >> n; //입력 받는 숫자의 개수

	int* array = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> array[i]; //숫자 입력받기
	}

	sort(array, array + n); //입력받은 숫자 정렬해서
	int m = array[n - 1]; //가장 큰 숫자 골라내기

	vector <bool> vt = premium(m); // 1부터 가장 큰 숫자까지 소수인지 아닌지 판별하는 함수

	int count = 0;
	for (int i = 0; i < n; i++) {
		if (vt[array[i]] == 0) { //입력받은 숫자가 소수이면 count 1 증가
			count++;
		}
	}

	cout << count;
}
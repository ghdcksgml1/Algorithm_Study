//N개의 자연수와 자연수 M이 주어졌을 때,
//아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램
//N개의 자연수는 모두 다른 수
//수열은 사전 순으로 증가하는 순서로 출력해야 함
// 중복되는 수열을 여러 번 출력하면 안됨
// 각 수열은 공백을 구분해서 출력

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n, m, end_value;
int arr[9] = { 0, };
bool isused[10001];

void hello(vector <int> vt) {
	for (int i = 0; i < vt.size(); i++) {
		isused[vt[i]] = false; //입력된 숫자가 아니라면 0
	}
}


void func(int k) { 
	if (k == m) {
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' '; //수열 출력
		}
		cout << "\n";
		return;
	}
	else {
		for (int i = 1; i <= end_value; i++) { 
			if (!isused[i]) {
				arr[k] = i; 
				isused[i] = 1;
				func(k + 1);
				isused[i] = 0;
			}
		}
	}
}


int main() {
	ios_base::sync_with_stdio(0); // 입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	vector <int> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i]; 
	}

	sort(v.begin(), v.end()); //입력된 수 정렬

	end_value = v[n - 1]; //마지막 인덱스(가장 큰 원소)

	for (int i = 0; i < 10001; i++) {
		isused[i] = 1; //isused 배열 모두 1로 초기화
	}

	hello(v);

	func(0);

	
}

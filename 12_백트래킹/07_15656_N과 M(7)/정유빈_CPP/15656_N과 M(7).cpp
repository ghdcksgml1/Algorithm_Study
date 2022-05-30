//N개의 자연수와 자연수 M이 주어졌을 때,
//아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램
//N개의 자연수는 모두 다른 수
// 중복되는 수열을 여러 번 출력하면 안됨
// 각 수열은 공백을 구분해서 출력

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m, end_value;
int arr[8] = { 0, };
bool isused[10001];

void func(int k, vector <int> vs) { //0
	if (k == m) {						
		for (int i = 0; i < m; i++) {     
			cout << arr[i] << ' ';   // cout << arr[0] 1 << arr[1] 2
		}
		cout << "\n";
		return;
	}
	else {
		for (int i = 0; i < n ; i++) {
				arr[k] = vs[i]; //arr[0] = 1   arr[1] = 1;  arr[1] = 4
				func(k+1, vs); //func(1,vs)	   func(2,vs)   func(2,vs)
		}
	}
}

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	vector <int> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i];
	}

	sort(v.begin(), v.end());

	end_value = v[n - 1]; //9

	func(0, v);


}

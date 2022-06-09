//N개의 자연수와 자연수 M이 주어졌을 때,
// 길이가 M인 수열을 모두 구하는 프로그램
// 같은 수를 여러 번 골라도 됨
// 고른 수열은 비내림차순이어야 함

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m, end_value;
int d = 0;
int arr[8];

void func(int k, vector <int> vs) {
	if (k == m) {
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' ';
		}
		cout << "\n";
		return;
	}
	else{
		for (int i = d; i < n; i++) { 
			arr[k] = vs[i]; 
			d = i;
			func(k + 1, vs); 
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

	func(0, v);


}

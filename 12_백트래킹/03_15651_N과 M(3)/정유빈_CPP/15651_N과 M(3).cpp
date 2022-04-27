// 자연수 N과 M이 주어졌을 때, 
//1부터 N까지 자연수 중에서 M개를 고른 오름차순 수열을 출력하는 프로그램
//같은 수를 여러 번 골라도 됨

#include <iostream>

using namespace std;

int n, m;
int d = 1;

int arr[8];

void func(int k) {

	if (k == m) {
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' ';
		}
		cout << "\n";
	}
	else {
		for (int i = 1; i <= n; i++) {
			arr[k] = i;
			func(k + 1);
		}
	}
}

int main() {
	ios_base::sync_with_stdio(0); // 입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m; //N 입력 >> M 입력


	func(0);
}
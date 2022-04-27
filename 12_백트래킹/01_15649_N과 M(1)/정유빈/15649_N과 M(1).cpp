//벡트래킹 알고리즘
//정수 n과 m이 주어졌을 때 nPm의 모든 경우의 수를 출력하는 프로그램

#include <iostream>

using namespace std;

int n, m;
int arr[20] = { 0, };
bool isused[21] = { false, };

void func(int k) { //0
	if (k == m) { //정수 m개가 다 차면
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' '; // 원소 출력
		cout << "\n";
	}
	else {
		for (int i = 1; i <= n; i++) {
			if (!isused[i]) { 
				arr[k] = i;
				isused[i] = 1;
				func(k + 1); //다음 인덱스의 정수 구하는 것
				isused[i] = 0;
			}
		}
	}
}


int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	func(0);
}
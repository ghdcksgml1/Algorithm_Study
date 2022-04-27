// 자연수 N과 M이 주어졌을 때, 
//1부터 N까지 자연수 중에서 M개를 고른 오름차순 수열을 출력하는 프로그램
//같은 수 중복 허용 안됨

#include <iostream>

using namespace std;

int n, m;
int d = 1;

int arr[8];
bool isused[9] = { false, };

void func(int k) { //0

	if (k == m) {
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' ';
		}
		cout << "\n";
	}
	else {
		for (int i = d; i <= n; i++) {
			if (!isused[i]) {
				arr[k] = i;
				isused[i] = 1; 
				d = i + 1;
				func(k + 1); 
				isused[i] = 0;
			}
		}
	}
}


int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m; //4 // 2


	func(0);
}

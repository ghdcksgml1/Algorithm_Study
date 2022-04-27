#include <iostream>

using namespace std;

int n, m;
int d = 1;
int arr[20];

void func(int k) {
	if (k == m) {
		for (int i = 0; i < k; i++) {
			cout << arr[i] << ' ';
		}
		cout << "\n";
	}
	else {
		for (int i = d; i <= n; i++) {
				arr[k] = i;
				d = i;
				func(k + 1);
		}
	}
}

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	func(0);
}

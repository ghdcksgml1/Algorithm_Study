#include <iostream>

using namespace std;

long long n;

char map[6600][6600];

void divide(int row, int col, int num) {
	if (num == 1) {
		map[row][col] = '*';
	}
	else{
		long long size = num / 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					continue;
				}
				divide(row + i * size, col + j * size, size);
			}
		}
	}

}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n;

	divide(0, 0, n);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << map[i][j];
		}
		cout << "\n";
	}
}

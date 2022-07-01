#include <iostream>
#include <cmath>
using namespace std;

int n;
char map[70][70];

bool check(int row, int col, int num) {

	char k = map[row][col];

	for (int i = row; i < row + num; i++) {
		for (int j = col; j < col + num; j++) {
			if (k != map[i][j]) {
				return false;
			}
		}
	}
	return true;
}

void divide(int row, int col, int num) {

	if (check(row, col, num)) {
		cout  << map[row][col];
	}
	else {
		cout << '(';
		int size = num / 2;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				divide(row + i * size, col + j * size, size);
			}
		}
		cout << ')';
	}
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> map[i][j];
		}
	}

	divide(0, 0, n);

}

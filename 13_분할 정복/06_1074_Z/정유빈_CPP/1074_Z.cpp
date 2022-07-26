#include <iostream>
#include <cstring>

using namespace std;

int n, r, c;

int cnt = 0;
void divide(int row, int col, int num) {

	if (num == 2) {
		if (r == row && c == col) {
			cout << cnt;
			exit(0);
		}
		else if (r == row + 1 && c == col) {
			cout << cnt + 2;
			exit(0);
		}
		else if (r == row && c == col + 1) {
			cout << cnt + 1;
			exit(0);
		}
		else if (r == row + 1 && c == col + 1) {
			cout << cnt + 3;
			exit(0);
		}
	}
	else {
		int size = num / 2;
		int mid_row = row + size;
		int mid_col = col + size;

		if (mid_row > r) {
			if (mid_col > c) {
				divide(row, col, size);
			}
			else {
				cnt += (size * size);
				divide(row, mid_col, size);
			}
		}
		else {
			if (mid_col > c) {
				cnt += (size * size * 2);
				divide(mid_row, col, size);
			}
			else {
				cnt += (size * size * 3);
				divide(mid_row, mid_col, size);
			}
		}
	}
	
}

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> r >> c;

	divide(0, 0, pow(2,n));
}

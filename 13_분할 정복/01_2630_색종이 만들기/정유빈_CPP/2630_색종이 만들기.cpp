
#include <iostream>

using namespace std;

int n;
bool map[130][130];
int result[2];

bool check(int row, int col, int size) {
	
	int k = map[row][col];

	for (int i = row; i < row + size; i++) {
		for (int j = col; j < col + size; j++) {
			if (k != map[i][j]) {
				return false;
			}
		}
	}
	return true;
}

void divide(int row, int col, int num) {

	if (check(row, col, num)) {
//		cout << "map[row][col]: " << map[row][col] << "\n";
		result[map[row][col]]++;
	}
	else {
		int size = num / 2;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
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

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> map[i][j];
		}
	}

	divide(0, 0, n);
	cout << result[0] << "\n";
	cout << result[1] << "\n";
}

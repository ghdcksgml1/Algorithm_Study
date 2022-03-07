#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int m, n;
	int rt;
	cin >> m >> n;

	for (int i = m; i <= n; i++) {
		rt = sqrt(i);
		if (rt == 1 && i != 1) {
			cout << i << "\n";
			continue;
		}
		if (i % 2) {
			for (int j = 2; j <= rt; j++) {
				if ((i % j)==0)
					break;
				if (j == rt) {
					cout << i << "\n";
				}
			}
		}
	}
}
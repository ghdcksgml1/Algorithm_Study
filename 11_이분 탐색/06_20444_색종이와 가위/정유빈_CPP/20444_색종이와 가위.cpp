#include <iostream>

using namespace std;

long long n, k;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> k;

	long long st = 0;
	long long en = n / 2 + 1;

	while(st<=en){
		long long mid = (st + en) / 2;

		long long res = (mid + 1) * (n - mid + 1);
		if (res == k) {
			cout << "YES";
			return 0;
		}
		else {
			if (st == en) {
				break;
			}
			if (res > k) {
				en = mid - 1;
			}
			else {
				st = mid + 1;
			}
		}
	}

	cout << "NO";
}

#include <iostream>
#include <string>
#include <cmath>
using namespace std;

long long n;
long long q;
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n; //8

	q = sqrt(n);

	if ((q * q) < n) {
		q++;
	}

	cout << q;
	return 0;
}

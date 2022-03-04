#include <iostream>

using namespace std;

int main() {
	int a, b, c, d;
	int count = 1;
	
	cin >> a; //26
	d = a;

	while (1) {

		b = a / 10; 

		c = a % 10; 

		a = 10 * c + ((b + c) % 10);

		if (d == a) {
			break;
		}
		count += 1;
	}
	cout << count;

	return 0;

}
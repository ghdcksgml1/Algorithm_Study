#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;
	int* array = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> array[i];
	}
	sort(array, array + n);

	int min = array[0];
	for (int i = 1; i <= min; i++)
	{
		int count = 1;
		if (min % i == 0) {
			for (int j = 1; j < n; j++) {
				if (array[j] % i == 0) {
					count++;
				}
				else
					break;
			}
			if (count == n) {
				cout << i << endl;
			}
		}


	}
}
#include <iostream>
using namespace std;

int main() {
	int *array;
	int min, max;
	cin >> min >> max;
	array = new int[max - min+1];
	int index = 0;

	for (int i = min; i <= max; i++) { //60, 61
		int count = 0;
		for (int j = 2; j < i; j++) {
			int left = i % j; //0
			if (left == 0) {
				array[index] = 0; //array[0] = 0
				index++; //check = 1
				break;
			}
			else {
				count++; //2~60 = 59
			}
		}
		if (count == i - 2) {
			array[index] = i;
			index++;
		}
	}
	int sum = 0;
	for (int i = 0; i <= max - min; i++) {
		if (array[i] != 0)
			sum += array[i];
	}

	if (sum == 0) {
		cout << "-1";
		exit(0);
	}
	else {
		cout << sum << endl;

	}

	for (int i = 0; i <= max - min; i++) {
		if (array[i] != 0) {
			cout << array[i];
			break;
		}
	}

}
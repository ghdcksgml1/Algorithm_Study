#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;
	int* array = new int[n];

	for (int k = 0; k < n; k++) {
		cin >> array[k];
	}

	sort(array, array + n);

	int* weight = new int[n];
	int j = 1;
	for (int i = n-1; i>= 0; i--) {
		weight[i] = array[i] * j;
		j++;
	}
	sort(weight, weight + n);
	
	cout << weight[n - 1];



}
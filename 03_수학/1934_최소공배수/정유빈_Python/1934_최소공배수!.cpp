#include <iostream>
#include <vector>
using namespace std;

int main() {
	int n, a, b, max_number, min_number;
	cin >> n;
	int* min_number_array = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> a >> b;

		vector<int> vec_a;
		vector<int> vec_b;

		for (int k = 1; k <= a; k++) {
			if (a % k == 0) {
				vec_a.push_back(k);
			}
		}
		int vec_a_size = vec_a.size();

		for (int p = 1; p <= b; p++) {
			if (b % p == 0) {
				vec_b.push_back(p);
			}
		}
		int vec_b_size = vec_b.size();

		int mx = -1;
		for (int t = 0; t < vec_a_size; t++) {
			for (int j = 0; j < vec_b_size; j++) {
				if (vec_a[t] == vec_b[j]) {
					max_number = max(mx, vec_a[t]);
				}
			}
		}

		min_number = max_number * (a / max_number) * (b / max_number);

		min_number_array[i] = min_number;
	}

	for (int i = 0; i < n; i++) {
		cout << min_number_array[i] << endl;
	}
	
		


}
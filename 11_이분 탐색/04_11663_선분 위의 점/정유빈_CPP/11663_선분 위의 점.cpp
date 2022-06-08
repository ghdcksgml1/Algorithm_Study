#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int n, m;

int arr[100001];

vector <int> v;
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	sort(arr, arr + n);

	while (m--) {

		int x, y;
		cin >> x >> y;

		int k = lower_bound(arr, arr + n, x) - arr;
		int t = lower_bound(arr, arr + n, y) - arr;

		if (binary_search(arr, arr + n, y)) {
			v.push_back(t - k + 1);
		}
		else {
			v.push_back(t - k);
		}
	}
	
	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << "\n";
	}
	
}

#include <iostream>
#include <string>
#include <vector>
using namespace std;

int n, m;
int input;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	vector <int> v(n);
	vector <string> vt(n);

	for (int i = 0; i < n; i++) {
		cin >> vt[i];
		cin >> v[i];
	}

	while (m--) {
		int x;
		cin >> x;
		int k = lower_bound(v.begin(), v.end(), x) - v.begin();
		cout << vt[k] << "\n";
	}

}

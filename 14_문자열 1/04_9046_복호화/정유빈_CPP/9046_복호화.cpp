#include <iostream>
#include <string>
using namespace std;

int n;

int arr[75];

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n;
	cin.ignore();

	for (int i = 0; i < n; i++) {

		for (int j = 0; j < 75; j++) {
			arr[j] = 0;
		}

		string st;

		getline(cin, st);

		for (int j = 0; j < st.length(); j++) {
			int k = st[j] - '0';
			arr[k]++;
		}

		int mx = 0;
		for (int j = 49; j < 75; j++) {
			mx = max(mx, arr[j]);
		}

		int cnt = 0;
		char c;
		for (int j = 49; j < 75; j++) {
			if (arr[j] == mx) {
				cnt++;
				c = j + '0';
			}
		}

		if (cnt != 1) {
			cout << "?" << "\n";
		}
		else {
			cout << c << "\n";
		}

	}


}

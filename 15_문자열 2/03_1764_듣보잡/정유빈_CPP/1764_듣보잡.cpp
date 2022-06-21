#include <iostream>
#include <set>
#include <string>
using namespace std;

int m, n;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	set <string> s1;
	set <string> s2;

	for (int i = 0; i < n; i++) {
		string st;
		cin >> st;
		s1.insert(st);
	}

	for (int i = 0; i < m; i++) {
		string st;
		cin >> st;
		if (s1.find(st) != s1.end()) {
			s2.insert(st);
		}
	}

	for (auto i : s2) {
		cout << i << "\n";
	}




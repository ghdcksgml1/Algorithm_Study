#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int n;
string st;


bool compare(string a, string b) {
	if (a.length() == b.length()) {
		return a < b;
	}
	else {
		return a.length() < b.length();
	}
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n;

	vector <string> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i];
	}

	sort(v.begin(), v.end());
	v.erase(unique(v.begin(), v.end()), v.end()); //중복 원소 제거

	sort(v.begin(), v.end(), compare);

	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << "\n";
	}
}

#include <iostream>
#include <string>
#include <map>

using namespace std;

int n;
string s;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	map<string, int> map1;

	cin >> n;

	for (int i = 0; i < n; i++) {

		cin >> s;

		int k = s.find('.');
		s.erase(0, k+1);
		cout << s;

		if (map1.find(s) != map1.end()) {
			map1[s]++;
		}
		else {
			map1.insert({ s,1 });
		}
	}
	for (auto i : map1) {
		cout << i.first << " " << i.second << "\n";
	}
	
}

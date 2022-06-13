#include <string>
#include <vector>
#include <iostream>

using namespace std;

int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	while (1) {
		string s;
		getline(cin, s);

		if (s == "END") {
			break;
		}

		for (int i = s.length()-1 ; i >= 0; i--) {
			cout << s[i];
		}
		cout << "\n";
	}
}

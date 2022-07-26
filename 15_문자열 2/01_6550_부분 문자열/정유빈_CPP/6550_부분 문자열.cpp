#include <iostream>
#include <string>

using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	string str, str2;
	while (1) {
		cin >> str >> str2;
		string answer = "Yes";
		for (int i = 0; i < str.size(); i++) {
			if (str2.find(str[i]) != string::npos) {
				int index = str2.find(str[i]);
				str2.erase(0, index + 1);
			}
			else {
				answer = "No";
			}
		}
		cout << answer << "\n";
	}
}

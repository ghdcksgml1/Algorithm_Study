#include <iostream>
#include <string>
using namespace std;

string st;
string st2;

char v[10] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> st >> st2;

	for (int i = 0; i < st.length(); i++) {
		for (int j = 0; j < 10; j++) {
			if (st[i] == v[j]) {
				st.erase(i, 1);
				i--;
				break;
			}
		}
	}

	if (st.find(st2) != string::npos) {
		cout << "1";
		return 0;
	}
	else {
		cout << "0";
	}
}

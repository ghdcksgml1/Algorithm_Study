#include <iostream>

using namespace std;

char ch[5][15];

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 15; j++) {
			ch[i][j] = '?';
		}
	}

	for (int i = 0; i < 5; i++) {
		string st;
		cin >> st;
		for (int j = 0; j < st.size(); j++) {
			ch[i][j] = st[j];
		}
	}

	for (int j = 0; j < 15; j++) {
		for (int i = 0; i < 5; i++) {
			if (ch[i][j] != '?') {
				cout << ch[i][j];
			}
		}
	}

}

#include <iostream>

using namespace std;

string st;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int a;
	cin >> a;

	cin >> st;

	int num = 0;

	for (int i = 0; i < st.size(); i++) {
		int k = st[i] - '0';
		num += k;
	}
	cout << num;

}

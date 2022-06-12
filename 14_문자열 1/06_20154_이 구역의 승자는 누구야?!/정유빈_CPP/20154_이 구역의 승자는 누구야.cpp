#include <iostream>
#include <string>
using namespace std;

string st;

int alpha_num[26] = { 3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1 };

long long sum = 0;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> st;

	for (int i = 0; i < st.size(); i++) {
		sum += alpha_num[st[i] - 'A'];
	}

	
	if (sum % 2 == 1) {
		cout << "I'm a winner!";
	}
	else {
		cout << "You're the winner?";
	}
}

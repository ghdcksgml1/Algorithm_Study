#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <stack>
using namespace std;
string st;
string word;

void print(stack <char>& s) {
	while (!s.empty()) {
		cout << s.top();
		s.pop();
	}
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	bool tag = false;
	getline(cin, st);

	stack <char> s;

	for (char c : st) {
		if (c == '<') {
			print(s);
			tag = true;
			cout << c;
		}
		else if (c == '>') {
			tag = false;
			cout << c;
		}
		else if (c == ' ') {
			print(s);
			cout << c;
		}
		else if (tag) {
			cout << c;
		}
		else {
			s.push(c);
		}
	}

	print(s);
}

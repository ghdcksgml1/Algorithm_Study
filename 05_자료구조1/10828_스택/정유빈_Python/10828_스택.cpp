#include <iostream>
#include <stack>
using namespace std;
stack <int> s;
int main() {
	int N;
	cin >> N;

	string str;

	for (int i = 0; i < N; i++) {
		cin >> str;

		if (str == "push") {
			int n;
			cin >> n;
			s.push(n);
			continue;
		}
		else if (str == "pop") {
			if (s.empty()) {
				cout << "-1";
			}
			else {
				cout << s.top();
				s.pop();
			}

		}
		else if (str == "size") {
			cout << s.size();
			continue;
		}
		else if (str == "empty") {
			if (s.empty()) {
				cout << "1";
			}
			else {
				cout << "0";
			}
		}
		else if (str == "top") {
			if (s.empty()) {
				cout << "-1";
			}
			else {
				cout << s.top();

			}
		}


	}
}
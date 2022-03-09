#include <iostream>
#include <stack>
using namespace std;

int main() {
	int k;
	cin >> k;

	for (int i = 0; i < k; i++) {

		string input;
		cin >> input;

		stack <char> s;
		string answer = "YES";
		

		for (int j = 0; j < input.length(); j++) {
			if (input[j] == '(') {
				s.push(input[j]);
			}
			else if (input[j] == ')' && !s.empty()) {
				s.pop();
			}
			else {
				answer = "NO";
				break;
			}
		}

		if (!s.empty()) {
			answer = "NO";
		}
		
		cout << answer << "\n";
	}

}
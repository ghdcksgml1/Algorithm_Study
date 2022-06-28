#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int T;

int palindrome(string s, int check) {
	int left = 0;
	int right = s.size() - 1;

	while (left < right) {
		if (s[left] != s[right]) {
			int len = right - left;
			if (check == 0) {
				if (palindrome(s.substr(left, len), 1) == 0 || palindrome(s.substr(left + 1, len), 1) == 0) {
					return 1;
				}
				else {
					return 2;
				}
			}
			else {
				return 2;
			}
		}
		else {
			left++;
			right--;
		}
	}

	return 0;
}
int main() {
	cin >> T;

	for (int test_case = 0; test_case < T; test_case++) {
		string st;
		cin >> st;

		cout << palindrome(st, 0) << "\n";
	}
}

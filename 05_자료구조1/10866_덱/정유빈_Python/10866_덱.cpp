#include <iostream>
#include <deque>

using namespace std;

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	deque <int> dq;

	int N;
	cin >> N;

	for (int i = 0; i < N; i++) {
		string input;
		cin >> input;

		if (input == "push_front") {
			int n;
			cin >> n;
			dq.push_front(n); // 力老 菊俊 盔家 眠啊
		}
		else if (input == "push_back") {
			int n;
			cin >> n;
			dq.push_back(n); //力老 第俊 盔家 眠啊
		}
		else if (input == "pop_front") {
			if (dq.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << dq.front() << "\n";
				dq.pop_front(); // 力老 菊 盔家 昏力
			}
		}
		else if (input == "pop_back") {
			if (dq.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << dq.back() << "\n";
				dq.pop_back(); //力老 第 盔家 昏力
			}
		}
		else if (input == "size") {
			cout << dq.size() << "\n";
		}
		else if (input == "empty") {
			if (dq.empty()) {
				cout << "1" << "\n";
			}
			else {
				cout << "0" << "\n";
			}
		}
		else if (input == "front") {
			if (dq.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << dq.front() << "\n"; //力老 菊 盔家 馆券
			}
		}
		else if (input == "back") {
			if (dq.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << dq.back() << "\n"; //力老 第 盔家 馆券
			}
		}



	}
}
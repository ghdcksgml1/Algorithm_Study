#include <iostream>
#include <queue>
using namespace std;

int main() {

	ios_base::sync_with_stdio(false); //시간 초과 나지 않기 위해 꼭 필요
	cin.tie(NULL);
	cout.tie(NULL);

	queue <int> q;

	int N;
	cin >> N;

	for (int i = 0; i < N; i++) {
		string input;
		cin >> input;

		if (input == "push") {
			int n;
			cin >> n;
			q.push(n);
		}
		else if (input == "pop") {
			if (q.empty()) {
				cout << "-1" <<"\n";
			}
			else {
				cout << q.front() <<"\n";
				q.pop();
			}
		}
		else if (input == "size") {
			cout << q.size() <<"\n";
		}
		else if (input == "empty") {
			if (q.empty()) {
				cout << "1" <<"\n";
			}
			else {
				cout << "0" <<"\n";
			}
		}
		else if (input == "front") {
			if (q.empty()) {
				cout << "-1" <<"\n";
			}
			else{
				cout << q.front() <<"\n";
			}
		}
		else if (input == "back") {
			if (q.empty()) {
				cout << "-1" <<"\n";
			}
			else{
				cout << q.back() <<"\n";
			}

		}
	}
	
}
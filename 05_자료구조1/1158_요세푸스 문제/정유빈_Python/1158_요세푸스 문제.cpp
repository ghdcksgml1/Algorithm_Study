#include <iostream>
#include <queue>
using namespace std;

void yosepuseu(int n, int k) {
	queue < int> q;

	for (int i = 1; i <= n; i++) {
		q.push(i);
	}

	cout << "<";

	while (q.size() != 1) {
		for (int j = 1; j < k; j++) {

			int m = q.front();
			q.push(m);
			q.pop();
		}
		cout << q.front() << ", ";
		q.pop();
	}
	cout << q.front();
	cout << ">";
}


int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int n, k;
	cin >> n >> k;

	yosepuseu(n, k);
}
#include <iostream>
#include <deque>
#include <utility>
using namespace std;


int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n; //풍선 개수
	cin >> n;

	deque <pair<int, int> > dq(n);

	for (int i = 0; i < n; i++) {
		dq[i].first = i + 1;
		cin >>  dq[i].second;
	}

	int m = dq.front().second;
	cout << dq.front().first << " ";
	dq.pop_front();

	while (dq.size() > 0) {

		if (m > 0) { 
			for (int i = 1; i < m; i++) {
				dq.push_back(make_pair(dq.front().first, dq.front().second));
				dq.pop_front();

			}
		}
		else {
			m = abs(m); //3
			for (int i = 0; i < m; i++) {
				dq.push_front(make_pair(dq.back().first, dq.back().second));
				dq.pop_back();
			}
		}

		cout << dq.front().first << " "; //4
		m = dq.front().second; //-3
		dq.pop_front();
		
	}
	
}
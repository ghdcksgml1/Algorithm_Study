#include <iostream>
#include <queue>
using namespace std;

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	priority_queue<int, vector<int>, greater<int>> pq; //최소 힙 선언

	int N;
	cin >> N;

	for (int i = 0; i < N; i++) {
		int input;
		cin >> input;

		if (input > 0) {
			pq.push(input);
		}
		else if(input == 0){
			if (pq.empty()) { //큐가 비었으면
				cout << "0" << "\n";
			}
			else {
				cout << pq.top() <<"\n"; //큐의 젤 앞(가장 작은) 원소 반환
				pq.pop(); // 큐 젤 앞 원소 삭제
			}
		}
	}


}
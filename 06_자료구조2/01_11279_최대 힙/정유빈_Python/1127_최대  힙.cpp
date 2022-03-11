#include <iostream>
#include <queue>

using namespace std;

int main() {

	ios_base::sync_with_stdio(false); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	priority_queue<int, vector<int>> q; //우선순위 큐 선언

	int N;
	cin >> N;
	
	for (int i = 0; i < N; i++) {
		long long input;
		cin >> input;

		if (input > 0) {
			q.push(input); //원소 삽입
		}
		else if(input ==0) {
			if (q.empty()) { //큐가 비어있으면
				cout << "0" << "\n";
			}
			else {
				cout << q.top() << "\n"; //맨 앞 원소 반환
				q.pop(); //맨 앞 원소 삭제 
			}
		}
	}

}
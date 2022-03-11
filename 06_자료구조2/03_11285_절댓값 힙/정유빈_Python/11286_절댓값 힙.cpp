#include <iostream>
#include <queue>
#include <cmath>
using namespace std;

int main() {

    ios_base::sync_with_stdio(0); //입출력 빠르게 하기 위함
    cin.tie(0);
    cout.tie(0);

    int N;
    cin >> N;

    priority_queue<pair<int, int>> pq; //우선순위 큐<정수,정수>형

    for (int i = 0; i < N; i++) {
        int input;
        cin >> input;

        if (input != 0) {
            pq.push({ -abs(input), -input }); //우선순위 큐는 pair.first값이 큰 순, pair.second가 큰 순으로 정렬됨
        }
        else {
            if (pq.empty()) {
                cout << "0" << "\n";
            }
            else {
                cout << -pq.top().second << "\n"; //우선순위 큐의 첫번째 원소의 second값 반환 
                pq.pop(); //큐의 첫번째 원소 삭제
            }
        }
    }

    return 0;
}
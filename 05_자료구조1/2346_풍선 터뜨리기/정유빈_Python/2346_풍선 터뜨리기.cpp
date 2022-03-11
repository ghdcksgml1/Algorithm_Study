#include <iostream>
#include <utility>
#include <deque>

using namespace std;

deque <pair<int, int>> dq; //두개의 정수 값을 하나로 묶음
int main() {
    ios_base::sync_with_stdio(0); //입출력 시간 줄이기
    cin.tie(0); 
    cout.tie(0);

    int N;
    cin >> N;

    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        dq.push_back(make_pair(tmp, i + 1)); //인덱스와 값을 하나로 묶어서 저장
    }

    while (true) {
        int cnt = dq.front().first;
        cout << dq.front().second << " ";
        dq.pop_front(); //첫번째 원소값 삭제

        if (dq.empty()) { //덱이 비어있으면 종료
            break;
        }
        else {
            if (cnt > 0) {
                for (int i = 0; i < cnt - 1; i++) {
                    dq.push_back(dq.front()); //제일 앞의 원소를 복제하여 뒤로 전달
                    dq.pop_front(); //제일 앞의 원소 삭제
                }
            }
            else {
                for (int i = 0; i < abs(cnt); i++) {
                    dq.push_front(dq.back()); //제일 뒤의 원소를 복제하여 앞으로 전달
                    dq.pop_back(); //제일 뒤의 원소 삭제
                }
            }
        }
    }

}
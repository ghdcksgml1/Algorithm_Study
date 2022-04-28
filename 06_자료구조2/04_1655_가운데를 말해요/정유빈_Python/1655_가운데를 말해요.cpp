#include <iostream>
#include <queue>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0); //입출력 속도 빠르게 하기 위해
    cin.tie(0);
    cout.tie(0);

    int n;
    cin >> n;

    priority_queue<int, vector<int>, less<int>> max_heap; //오름차순 최대 힙 선언
    priority_queue<int, vector<int>, greater<int>> min_heap; //내림차순 최소 힙 선언

    while (n--) {
        int input;
        cin >> input; //입력 받기
        if (max_heap.size() == min_heap.size()) { //최대 힙과 최소힙 번갈아가며 원소 삽입
            max_heap.push(input);
        }
        else {
            min_heap.push(input);
        }

        if (!max_heap.empty() && !min_heap.empty()) { //최대 힙과 최소 힙 둘 다 비어있지 않다면
            if (max_heap.top() > min_heap.top()) { //최대힙의 첫번째 원소가 최소힙의 첫번째 원소보다 크다면
                max_heap.push(min_heap.top()); //최소힙의 첫번째 원소를 최대힙에 삽입
                min_heap.pop(); //최소힙의 첫번째 원소 삭제
                min_heap.push(max_heap.top()); //최대힙의 첫번째 원소를 최소힙에 삽입
                max_heap.pop(); //최대힙의 첫번쨰 원소 삭제
            } //결국 각 최소힙고 최대힙의 첫번째 원소를 바꿔줌
        }
        cout << max_heap.top() << "\n"; // 최대힙의 첫번째 원소 출력
    }
    return 0;

}
#include <iostream>
#include <queue>

using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    queue <int> q;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    cout << "<";

    while (!q.empty()) {
        for (int i = 0; i < k - 1; i++) {
            q.push(q.front()); // 첫 원소부터 삭제하지 않는 원소 바로 직전까지의 원소 모두 각각 push하고( 뒤로 이동 )
            q.pop(); // 삭제
        }
        if (q.size() == 1) { //큐의 사이즈가 1이면
            cout << q.front() << ">";
            q.pop();
        }
        else {
            cout << q.front() << ", ";
            q.pop();
        }
    }
    return 0;
}
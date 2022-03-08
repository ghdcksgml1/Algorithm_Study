#include <iostream>

bool bool_array[10001]; //bool 원소들의 default값은 0

using namespace std;
int main() {
    int N, K;
    int count = 0;
    cin >> N >> K;

    for (int i = 2; i <= N; i++) {
        for (int j = 1; i * j <= N; j++) {
            if (bool_array[i * j] == 0) {
                bool_array[i * j] = 1;
                count++;

                if (count == K)
                    cout << i * j;
            }
        }
    }
}
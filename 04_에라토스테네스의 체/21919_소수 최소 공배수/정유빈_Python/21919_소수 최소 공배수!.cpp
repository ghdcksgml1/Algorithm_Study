#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
using namespace std;
typedef long long ll;

int main() {

    int num;
    cin >> num;
    vector<int> v;
    int input[10000] = { 0, };

    for (int i = 0; i < num; i++) {
        cin >> input[i];
    }

    for (int i = 0; i < num; i++) {
        int count = floor(sqrt(input[i]));
        int check = 0;
        if (count == 1 && (input[i] != 1)) { //원소가 2 또는 3이면
            v.push_back(input[i]);
            continue;
        }
        else {
            for (int j = 2; j <= sqrt(input[i]); j++) {
                if (input[i] % j == 0) {
                    break;
                }
                else {
                    check++;
                }
            }
        }
        if (count == check + 1 && input[i] != 1) {
            v.push_back(input[i]);
        }
    }
    //만약 소수 개수가 0이라면 -1 출력 후 종료
    if (v.size() == 0) {
        cout << "-1";
        return 0;
    }

    //소수 모여있는 vector 중복 원소 제거
    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());

    // 중복 없는 소수들만의 벡터이므로, 최소공배수는 각 소수들의 곱

    ll result = 1;

    for (int i = 0; i < v.size(); i++) {
        result *= v[i];
    }

    cout << result;

}
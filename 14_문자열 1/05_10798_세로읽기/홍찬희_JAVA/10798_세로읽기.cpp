// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2024 KB , 시간 : 0ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

string str[5];

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int max_length=0;

    for(int i=0;i<5;i++){
        cin>>str[i];
        int size = str[i].size();
        max_length = max(max_length,size);
    }

    for(int i=0;i<max_length;i++){
        for(int j=0;j<5;j++){
            if(str[j].size() > i) {
                cout<<str[j][i];
            }
        }
    }


    return 0;
}
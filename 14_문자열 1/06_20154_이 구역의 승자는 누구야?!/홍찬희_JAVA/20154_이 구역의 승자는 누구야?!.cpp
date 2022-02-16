// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 11364 KB , 시간 : 20ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int alpha[26] = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
vector<int> num[20]; // 2의 20 제곱은 1,xxx,xxx

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    string K;
    cin>>K;
    for(int i=0;i<K.size();i++){
        num[0].push_back(alpha[K[i]-'A']);
    }

    int i;
    for(i=0;num[i].size()!=1;i++){
        for(int j=0;j<num[i].size();j+=2){
            if(j+1 == num[i].size()){
                num[i+1].push_back(num[i][j]);
            }else{
                num[i+1].push_back((num[i][j]+num[i][j+1])%10);
            }
        }
    }

    if(num[i][0] % 2 == 1){
        cout<<"I'm a winner!"<<'\n';
    }else{
        cout<<"You're the winner?"<<'\n';
    }

    return 0;
}
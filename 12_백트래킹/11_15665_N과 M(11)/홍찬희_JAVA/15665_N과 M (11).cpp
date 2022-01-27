// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2024 KB , 시간 : 48ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N,M;
int arr[8];

void backtracking(int x,string str){
    if(x==M){
        cout<<str<<'\n';
        return ;
    }
    int mul = -1;
    for(int i=0;i<N;i++){
        if(mul == arr[i])continue;
        mul = arr[i];
        backtracking(x+1,str+to_string(arr[i])+" ");
    }
}

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N>>M;
    for(int i=0;i<N;i++) cin>>arr[i];

    sort(arr,arr+N);

    backtracking(0,"");

    return 0;
}
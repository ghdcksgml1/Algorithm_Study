// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2024 KB , 시간 : 0ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N,M;
int arr[9];
bool check[9];

void backtracking(int x,int prev,string str){
    if(x == M){
        cout<<str<<'\n';
        return;
    }
    int mul = -1; // 중요!
    for(int i=prev;i<N;i++){
        if(check[i] || mul == arr[i]) continue;
        check[i] = true;
        mul = arr[i];
        backtracking(x+1,i,str+to_string(arr[i])+" ");
        check[i] = false;
    }
}

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N>>M;

    for(int i=0;i<N;i++) cin>>arr[i];

    sort(arr,arr+N);

    backtracking(0,0,"");

    return 0;
}
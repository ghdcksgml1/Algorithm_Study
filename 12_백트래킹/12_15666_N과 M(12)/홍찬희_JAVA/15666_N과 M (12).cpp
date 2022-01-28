// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2024 KB , 시간 : 0ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N,M;
int arr[10];
vector<int> v;
void backtracking(int x,string str,int prev){
    if(x == M){
        cout<<str<<'\n';
        return;
    }
    for(int i=prev;i<v.size();i++){
        backtracking(x+1,str+to_string(v[i])+" ",i);
    }
}
int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N>>M;
    for(int i=0;i<N;i++) cin>>arr[i];
    sort(arr,arr+N);
    int prev=-1;
    for(int i=0;i<N;i++){
        if(prev != arr[i]) v.push_back(arr[i]);
        prev = arr[i];
    }
    backtracking(0,"",0);
    return 0;
}
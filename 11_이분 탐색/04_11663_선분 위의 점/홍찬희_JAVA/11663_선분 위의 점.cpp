// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2412 KB , 시간 : 76 ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N,M;
int arr[100001];

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N>>M;
    for(int i=0;i<N;i++) cin>>arr[i];
    sort(arr,arr+N);
    for(int i=0;i<M;i++){
        int tmp1,tmp2;
        cin>>tmp1>>tmp2;
        if(tmp1 > tmp2){
            tmp1 ^= tmp2;
            tmp2 ^= tmp1;
            tmp1 ^= tmp2;
        }
        // lower_bound
        int l_st=0,l_en=N-1;
        while(l_st < l_en){
            int mid = (l_st + l_en) / 2;
            if(arr[mid] >= tmp1) l_en = mid;
            else l_st = mid+1;
        }

        // upper_bound
        int u_st=0,u_en=N-1;
        while(u_st < u_en){
            int mid = (u_st + u_en + 1) / 2;
            if(arr[mid] > tmp2) u_en = mid-1;
            else u_st = mid;
        }
        if(tmp1 > arr[N-1] || tmp2 < arr[0]) cout<<(u_st - l_st)<<'\n';
        else cout<<(u_st - l_st + 1)<<'\n';
    }

    return 0;
}
// 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 9832 KB , 시간 : 56 ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N,M;
vector<pair<string,int>> v;

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N>>M;
    for(int i=0;i<N;i++){
        string tmp1 = ""; int tmp2;
        cin>>tmp1>>tmp2;
        v.push_back({tmp1,tmp2});
    }

    for(int i=0;i<M;i++){
        int st=0,en=v.size()-1,target;
        cin>>target;

        // lower_bound 구현
        while(st < en){
            int mid = (st + en) / 2;
            // 타겟보다 mid값이 크거나 같으면 en을 mid로 변경
            if(v[mid].second >= target) en = mid;
            // 타겟보다 mid값이 작으면 st을 mid+1로 변경
            else st = mid+1;
        }

        cout<<v[st].first<<'\n';
    }

    return 0;
}
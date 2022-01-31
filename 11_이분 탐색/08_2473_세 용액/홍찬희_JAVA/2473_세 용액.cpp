// 언어 : C++ , (성공/실패) : 1/15 , 메모리 : 2068 KB , 시간 : 480ms
#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h> // memset

using namespace std;

typedef long long ll;

int N;
ll arr[5001];
bool check[5001];
vector<ll> result;

ll absol(ll a){
    if(a >= 0) return a;
    else return -a;
}

int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N;
    for(int i=0;i<N;i++) cin>>arr[i];

    sort(arr,arr+N);

    ll Min = 2000001232130001;
    ll Min_i = 0;
    ll Min_j = 0;
    ll Min_k = 0;

    for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            ll target = (-1)*(arr[i] + arr[j]);

            check[i] = true; check[j] = true;

            int st = 0,en = N-1;
            // lower_bound
            while(st < en){
                int mid = (st+en) / 2;
                if(arr[mid] >= target) en = mid;
                else st = mid + 1;
            }
            ll tmp1 = 200024322432000001;
            ll tmp2 = 2000234324342000001;
            if (st > 0 && !check[st-1]) tmp1 = absol(target - arr[st - 1]);
            if(!check[st]) tmp2 = absol(target - arr[st]);
            if (tmp1 < tmp2) {
                target = tmp1;
                st--;
            }else
                target = tmp2;
            if (Min > target) {
                Min = target;
                Min_i = arr[i];
                Min_j = arr[j];
                Min_k = arr[st];
            }
            check[i] = false;
            check[j] = false;
        }
    }

    result.push_back(Min_i);
    result.push_back(Min_j);
    result.push_back(Min_k);

    sort(result.begin(),result.end());

    cout<<result[0]<<' '<<result[1]<<' '<<result[2]<<'\n';

    return 0;
}
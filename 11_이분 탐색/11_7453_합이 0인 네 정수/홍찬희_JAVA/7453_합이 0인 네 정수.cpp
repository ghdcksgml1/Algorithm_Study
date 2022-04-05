// 언어 : C++ , (성공/실패) : 1/4 , 메모리 : 166060 KB , 시간 : 4456ms
#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>
#include <string.h> // memset

using namespace std;

int N;
int arr[4000][4];
vector<int> v1;
vector<int> v2;
long long result = 0;
int main(void){
    // 입출력 속도 최적화
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    cin>>N;
    for(int i=0;i<N;i++){
        int n1,n2,n3,n4;
        cin>>n1>>n2>>n3>>n4;
        arr[i][0] = n1;arr[i][1] = n2;arr[i][2] = n3;arr[i][3] = n4;
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            v1.push_back(arr[i][0]+arr[j][1]);
        }
    }

    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            v2.push_back(arr[i][2]+arr[j][3]);
        }
    }

    sort(v1.begin(),v1.end());
    sort(v2.begin(),v2.end());

    for(int i=0;i<N*N;i++){
        int tmp = (-1)*v1[i];
        result += upper_bound(v2.begin(),v2.end(),tmp) - lower_bound(v2.begin(),v2.end(),tmp);
    }

    cout<<result<<'\n';

    return 0;
}
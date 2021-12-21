#include <iostream>
#include <vector>
#include <queue>
#define MAX 1001

using namespace std;

int T,N,K,W;
int D[MAX]; // 건설시간을 담은 배열

int arr[MAX]; // 간선의 개수를 저장한 배열
int result[MAX]; // 현재위치까지의 걸리는 시간
vector<int> v[MAX]; // 간선을 저장한 벡터

void topologySort(){
  queue<int> q;
  // 간선이 0인 부분을 찾기
  for(int i=1;i<=N;i++){
    if(arr[i] == 0){
       q.push(i);
       result[i] = D[i];
    }
  }
  
  for(int i=1;i<=N;i++){
    int x = q.front();
    q.pop();
  
    for(int j=0;j<v[x].size();j++){
      int y = v[x][j];
      result[y] = max(result[y],result[x]+D[y]);
      if(--arr[y] == 0){
        q.push(y);
      }
    }
  }
  cout<<result[W]<<'\n';
}

// 테스트케이스가 여러개이므로, 변수초기화가 필요
void reset(){
  for(int i=0;i<=N;i++){
    arr[i] = 0;
    result[i] = 0;
    D[i] = 0;
    v[i].clear();
  }
}

void init(){
  cin.tie(0);
  cout.tie(0);
}

int main(void){
  init();

  cin>>T;
 

  while(T--){
    cin>>N>>K;

    for(int i=1;i<=N;i++){
      cin>>D[i];
    }

    for(int i=0;i<K;i++){
      int n1,n2;
      cin>>n1>>n2;
      v[n1].push_back(n2);
      arr[n2]++;
    }

    cin>>W;

    if(arr[W] != 0)
      topologySort();
    else
      cout<<D[W]<<'\n';
    reset();
  }

  return 0;
}
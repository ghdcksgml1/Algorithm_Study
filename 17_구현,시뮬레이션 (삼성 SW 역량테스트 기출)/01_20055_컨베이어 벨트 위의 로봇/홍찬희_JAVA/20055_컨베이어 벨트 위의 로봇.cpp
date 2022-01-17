// 컨베이어 벨트 위의 로봇
#include <iostream>
#include <deque>

using namespace std;

int N,K;

deque<pair<int,int>> belt; //{ 내구도,로봇위치여부 }

// 벨트 한 칸 회전
void stage_1(){
  belt.push_front(belt.back());
  belt.pop_back();
  // 로봇이 내리는 위치에 있으면 내리기
  if(belt[N-1].second == 1) belt[N-1].second = 0; 
}

// 한칸 이동가능하면 이동, 아니면 가만히
// 내구도 1이상 남아있어야함.
void stage_2(){
  for(int i=N-2;i>=0;i--){
    if(belt[i].second == 1 && belt[i+1].first > 0 && belt[i+1].second == 0){
      belt[i].second = 0;
      belt[i+1].first--;
      belt[i+1].second = 1;
    }
  }
  // 로봇이 내리는 위치에 있으면 내리기
  if(belt[N-1].second == 1) belt[N-1].second = 0;
}

// 올리는 위치에 있는 칸의 내구도가 0이 아니면 올리는 위치에 로봇을 올림
void stage_3(){
  if(belt[0].first > 0){
    belt[0].first--;
    belt[0].second = 1;
  }
}

// 내구도가 0인 칸의 개수가 K개 이상일때 과정 종료
bool stage_4(){
  int K_cnt = 0;
  for(int i=0;i<2*N;i++){
    if(belt[i].first == 0) K_cnt += 1;
  }
  if(K_cnt >= K) return true;
  else return false;
}

void init(){
  ios::sync_with_stdio(0);
  cin.tie(0); cout.tie(0);
}

int main(void){
  init();
  
  cin>>N>>K;

  for(int i=0;i<2*N;i++){
    int n;
    cin>>n;
    belt.push_back({n,0});
  }

  int cnt = 0;
  while(true){
    cnt++;
    stage_1();
    stage_2();
    stage_3();
    if(stage_4()) break;
  }
  cout<<cnt<<'\n';
}
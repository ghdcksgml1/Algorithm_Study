// 상어초등학교
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int N;

int like[21][21][401]; // 좌표의 좋아하는 학생의 수 ex) like[4][3][5]=3면 4,3에 5번학생이 들어오면 좋아하는 사람은 3명이다.
int graph[21][21]; // (r,c)에 배치된 학생
int result[21][21]; // 학생의 만족도

int dx[4] = {1,-1,0,0};
int dy[4] = {0,0,1,-1};

int v[401][4]; // 학생이 좋아하는 학생 4명을 담아주는 벡터
vector<int> order; // 배치하는 학생의 순서

// {i,{j,k}} 에서 i는 내림차순, j,k는 오름차순
bool compare(pair<int,pair<int,int>> a, pair<int,pair<int,int>> b){
  if(a.first == b.first){
    if(a.second.first == b.second.first){
      return a.second.second < b.second.second;
    }
    return a.second.first < b.second.first;
  }
  return a.first > b.first;
}

// 상하좌우의 탐색을 통해 빈 배열이 몇개인지 반환하는 함수
int empty_counter(int r,int c){
  int result = 0;
  for(int i=0;i<4;i++){
    int rx = r + dx[i];
    int ry = c + dy[i];
    if(rx<=0 || rx>N || ry<=0 || ry>N) continue;
    if(graph[rx][ry] == 0) result+=1;
  }
  return result;
}

// 상하좌우의 탐색을 통해 num이 좋아하는 학생의 수를 반환
int like_counter(int r,int c,int num){
  int result = 0;
  for(int i=0;i<4;i++){
    int rx = r + dx[i];
    int ry = c + dy[i];
    if(rx<=0 || rx>N || ry<=0 || ry>N) continue;
    for(int j=0;j<4;j++){
      int temp_num = v[num][j];
      if(graph[rx][ry] == temp_num) result+=1;
    }
  }
  return result;
}

// 상하좌우의 탐색을 통해 해당학생 만족도를 반환하는 함수
int result_like_counter(int r,int c){
  int result = 0;
  for(int i=0;i<4;i++){
    int rx = r + dx[i];
    int ry = c + dy[i];
    if(rx<=0 || rx>N || ry<=0 || ry>N) continue;
    for(int j=0;j<4;j++){
      int temp_num = v[graph[r][c]][j];
      if(graph[rx][ry] == temp_num) result+=1;
    }
  }
  if(result == 2) result = 10;
  if(result == 3) result = 100;
  if(result == 4) result = 1000;
  return result;
}

void init(){
  ios::sync_with_stdio(0);
  cin.tie(0); cout.tie(0);
}

int main(void){
  init();
  cin>>N;

  
  for(int i=0;i<N*N;i++){
    int n,l1,l2,l3,l4;
    cin>>n>>l1>>l2>>l3>>l4;
    order.push_back(n);
    v[n][0]= l1;
    v[n][1]= l2;
    v[n][2]= l3;
    v[n][3]= l4;
  }
  graph[2][2] = order[0];
  // 1. 비어있는 칸 중에서 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리를 정한다.
  // 2. 1을 만족하는 칸이 여러 개이면, 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리를 정한다.
  // 3. 2를 만족하는 칸도 여러 개인 경우에는 행의 번호가 가장 작은 칸으로, 그러한 칸도 여러개이면 가장 작은 칸으로 자리를 정한다.
  for(int o=1;o<order.size();o++){
    int num = order[o]; // 배치할 학생
    // graph 탐색
    int like_num = 0;
    int like_num_cnt = 0;
    int like_r = 0;
    int like_c = 0;
    vector<pair<int,pair<int,int>>> empty; // {빈칸개수,{행,열}}
    for(int i=1;i<=N;i++){
      for(int j=1;j<=N;j++){
        // 비어있는 칸 중 좋아하는 학생의 수를 like_num으로 센다.
        if(graph[i][j] != 0) continue;
        int temp_like_num = like_counter(i,j,num);
        if(temp_like_num > like_num){
          like_num = temp_like_num;
          like_num_cnt += 1;
          like_r = i;
          like_c = j;
        }else if(temp_like_num == like_num){
          like_r = i;
          like_c = j;
          like_num_cnt += 1;
        }
      }
    }
    // 1번 조건을 만족하는 경우와 그렇지 않은 경우
    if(like_num_cnt > 1){
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
          // 1을 만족하는 칸중에서 비어있는 칸을 구해서 empty에 넣어줌.
          if(graph[i][j] != 0) continue;
          if(like_counter(i,j,num) == like_num)
            empty.push_back({empty_counter(i,j),{i,j}});
        }
      }
      sort(empty.begin(),empty.end(),compare);
      int r = empty[0].second.first;
      int c = empty[0].second.second;
      graph[r][c] = num;
    }else{
      graph[like_r][like_c] = num;
    }
  }
  int result = 0;
  for(int i=1;i<=N;i++){
    for(int j=1;j<=N;j++){
      result += result_like_counter(i,j);
    }
  }
  cout<<result<<'\n';
}
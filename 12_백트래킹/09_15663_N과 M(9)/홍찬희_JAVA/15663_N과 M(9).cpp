#include <iostream>
#include <algorithm>

using namespace std;

int N,M;
int arr[10];
int check[10];

void backtracking(int x,string str){
  if(x == M){
    cout<<str<<'\n';
    return;
  }
  int mul = -1;
  for(int i=0;i<N;i++){
    if(check[i] || mul == arr[i]) continue;
    mul = arr[i];
    check[i] = true;
    backtracking(x+1,str +to_string(arr[i])+" ");
    check[i] = false;
  }
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0); cout.tie(0);
  
  cin>>N>>M;
  for(int i=0;i<N;i++){
    cin>>arr[i];
  }
  sort(arr,arr+N);
  backtracking(0,"");

  return 0;
} 
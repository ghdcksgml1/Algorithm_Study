## 📚 04_에라토스테네스의 체

순서대로 푸는게 좋아요.

추천 문제는 (✅ 체크표시) 했습니다.

<br/>

## 에라토스테네스의 체

<br/>

에라토스테네스의 체는 대량의 소수를 빠르게 찾아낼 수 있는 방법이다.

소수란? 1과 자기자신 외에는 어떠한수로도 나눌 수 없는 수

원리는 아주 간단하다.

Ex.)

2에서 10까지 수 중에서 소수를 찾는다 가정해보자.

2에서 2를 제외한 배수들을 제거한다. ( 4, 6, 8, 10 제거)

3에서 3을 제외한 배수들을 제거한다. ( 6, 9 제거)

...

10까지 반복한 뒤 그렇게 제거되지 않은 수들을 찾아낸다.

결과 : 2, 3, 5, 7 이 소수이다.

코드 🔽

```c
#include <stdio.h>

bool Num[11];

void PrimeNum(int N,int M){
     for(int i=2;i*i<=M;i++){
          if(Num[i] == true) continue; // true인 경우 i의 배수의 경우도 무조건 다 true이다. ex) i=4일경우
          for(int j=2;i*j<=M;j++){
               Num[i*j] = true;
          }
     }
}

int main(void){
     int n = 2;
     int m = 10;
     
     PrimeNum(2,10);
     
     for(int i=N;i<M;i++){
          if(Num[i] == false)
               printf("%d ",i);
     }
     
     return 0;
}
```

**시간 복잡도 : O(Nlog(logN))**

##

<table>
  <tr>
    <td align="center">순서</td>
    <td align="center">추천 문제</td>
    <td align="center">난이도</td>
    <td align="center">문제 번호</td>
    <td align="center">문제 이름</td>
    <td align="center">문제 링크</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">2960</td>
    <td align="center">에라토스테네스의 체</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2960">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">1978</td>
    <td align="center">소수 찾기</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1978">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/8.svg"></td>
    <td align="center">21919</td>
    <td align="center">소수 최소 공배수</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/21919">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">04</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/9.svg"></td>
    <td align="center">1929</td>
    <td align="center">소수 구하기</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1929">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center"></td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/13.svg"></td>
    <td align="center">1644</td>
    <td align="center">소수의 연속합</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1644">바로가기</a></td>
  </tr>
</table>

<br/><br/>

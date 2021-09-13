## 📚 03_수학

순서대로 푸는게 좋아요.

추천 문제는 (✅ 체크표시) 했습니다.

<br/>

## **알아두면 나중에 써먹을 일이 많은 법칙** : [유클리드 호제법](https://namu.wiki/w/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C%20%ED%98%B8%EC%A0%9C%EB%B2%95#s-3.3.1) (최대공약수를 빠르게 구하는 방법임.)

```c
#include <stdio.h>

// (a > b)일때
int Euclidean(int a,int b){
     int r = a % b;
     if (r == 0)
         return b;
     else
         return Euclidean(b,r);
}

int main(void){
    printf("%d\n",Gcd(100,200));
  
    return 0;
}

```

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
          for(int j=2;j<=M;j++){
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

<br/>

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
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/3.svg"></td>
    <td align="center">5618</td>
    <td align="center">공약수</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/5618">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/5.svg"></td>
    <td align="center">1110</td>
    <td align="center">더하기 사이클</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1110">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">1934</td>
    <td align="center">최소공배수</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1934">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">04</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">2581</td>
    <td align="center">소수</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2581">바로가기</a></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center">✅</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">2217</td>
    <td align="center">로프</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2217">바로가기</a></td>
  </tr>
</table>

<br/><br/>

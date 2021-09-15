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

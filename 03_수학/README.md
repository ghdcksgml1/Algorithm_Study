## π 03_μν

μμλλ‘ νΈλκ² μ’μμ.

μΆμ² λ¬Έμ λ (β μ²΄ν¬νμ) νμ΅λλ€.

<br/>

## **μμλλ©΄ λμ€μ μ¨λ¨Ήμ μΌμ΄ λ§μ λ²μΉ** : [μ ν΄λ¦¬λ νΈμ λ²](https://namu.wiki/w/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C%20%ED%98%B8%EC%A0%9C%EB%B2%95#s-3.3.1) (μ΅λκ³΅μ½μλ₯Ό λΉ λ₯΄κ² κ΅¬νλ λ°©λ²μ.)

```c
#include <stdio.h>

// (a > b)μΌλ
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
    <td align="center">μμ</td>
    <td align="center">μΆμ² λ¬Έμ </td>
    <td align="center">λμ΄λ</td>
    <td align="center">λ¬Έμ  λ²νΈ</td>
    <td align="center">λ¬Έμ  μ΄λ¦</td>
    <td align="center">λ¬Έμ  λ§ν¬</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center">β</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/3.svg"></td>
    <td align="center">5618</td>
    <td align="center">κ³΅μ½μ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/5618">λ°λ‘κ°κΈ°</a></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center">β</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/5.svg"></td>
    <td align="center">1110</td>
    <td align="center">λνκΈ° μ¬μ΄ν΄</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1110">λ°λ‘κ°κΈ°</a></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center">β</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">1934</td>
    <td align="center">μ΅μκ³΅λ°°μ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1934">λ°λ‘κ°κΈ°</a></td>
  </tr>
  <tr>
    <td align="center">04</td>
    <td align="center">β</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">2581</td>
    <td align="center">μμ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2581">λ°λ‘κ°κΈ°</a></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center">β</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/7.svg"></td>
    <td align="center">2217</td>
    <td align="center">λ‘ν</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2217">λ°λ‘κ°κΈ°</a></td>
  </tr>
</table>

<br/><br/>

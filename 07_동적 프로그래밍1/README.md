## ๐ 07_Dynamic Programming 1 (๋์  ํ๋ก๊ทธ๋๋ฐ 1)

์์๋๋ก ํธ๋๊ฒ ์ข์์.

์ถ์ฒ ๋ฌธ์ ๋ (โ ์ฒดํฌํ์) ํ์ต๋๋ค.

<br/>

### 2๋ฒ ๋ฌธ์  ํ๋ ๋์์ด๋๋ ์กฐํฉ๊ณต์

<img width="235" alt="แแณแแณแแตแซแแฃแบ 2021-11-14 แแฉแแฎ 2 49 22" src="https://user-images.githubusercontent.com/79779676/141669331-5ea94a56-f70d-4063-a76c-90b67f8119d8.png">

<br/>

<table>
  <tr>
    <td align="center">์์</td>
    <td align="center">์ถ์ฒ ๋ฌธ์ </td>
    <td align="center">๋์ด๋</td>
    <td align="center">๋ฌธ์  ๋ฒํธ</td>
    <td align="center">๋ฌธ์  ์ด๋ฆ</td>
    <td align="center">๋ฌธ์  ๋งํฌ</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/4.svg"></td>
    <td align="center">10870</td>
    <td align="center">ํผ๋ณด๋์น ์ 5</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/10870">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">1010</td>
    <td align="center">๋ค๋ฆฌ ๋๊ธฐ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1010">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">9655</td>
    <td align="center">๋ ๊ฒ์</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/9655">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">04</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/8.svg"></td>
    <td align="center">11726</td>
    <td align="center">2xn ํ์ผ๋ง</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/11726">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/9.svg"></td>
    <td align="center">1106</td>
    <td align="center">ํธํ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1106">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">06</td>
    <td align="center">โ</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/10.svg"></td>
    <td align="center">2294</td>
    <td align="center">๋์  2</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2294">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
  <tr>
    <td align="center">07</td>
    <td align="center"></td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/10.svg"></td>
    <td align="center">21317</td>
    <td align="center">์ง๊ฒ๋ค๋ฆฌ ๊ฑด๋๊ธฐ</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/21317">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
  </tr>
</table>

<br/><br/>

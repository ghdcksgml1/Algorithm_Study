## ð 11 ì´ë¶ íì (Binary Search)

ììëë¡ í¸ëê² ì¢ìì.

ì¶ì² ë¬¸ì ë (â ì²´í¬íì) íìµëë¤.

<br/>

<table>
  <tr>
    <td align="center">ìì</td>
    <td align="center">ì¶ì² ë¬¸ì </td>
    <td align="center">ëì´ë</td>
    <td align="center">ë¬¸ì  ë²í¸</td>
    <td align="center">ë¬¸ì  ì´ë¦</td>
    <td align="center">ë¬¸ì  ë§í¬</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">1789</td>
    <td align="center">ìë¤ì í©</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1789">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg"></td>
    <td align="center">2417</td>
    <td align="center">ì ì ì ê³±ê·¼</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2417">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/8.svg"></td>
    <td align="center">19637</td>
    <td align="center">IFë¬¸ ì¢ ëì  ì¨ì¤</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/19637">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">04</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/8.svg"></td>
    <td align="center">11663</td>
    <td align="center">ì ë¶ ìì ì </td>
    <td align="center"><a href="https://www.acmicpc.net/problem/11663">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/10.svg"></td>
    <td align="center">3079</td>
    <td align="center">ìêµ­ì¬ì¬</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/3079">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">06</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/11.svg"></td>
    <td align="center">20444</td>
    <td align="center">ìì¢ì´ì ê°ì</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/20444">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">07</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/12.svg"></td>
    <td align="center">1477</td>
    <td align="center">í´ê²ì ì¸ì°ê¸°</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1477">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">08</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/12.svg"></td>
    <td align="center">2473</td>
    <td align="center">ì¸ ì©ì¡</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2473">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">09</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/13.svg"></td>
    <td align="center">2412</td>
    <td align="center">ìë²½ ë±ë°</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/2412">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">10</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/14.svg"></td>
    <td align="center">1300</td>
    <td align="center">Kë²ì§¸ ì</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/1300">ë°ë¡ê°ê¸°</a></td>
  </tr>
  <tr>
    <td align="center">11</td>
    <td align="center">â</td>
    <td align="center"><img height="23px" width="25px" src="https://d2gd6pc034wcta.cloudfront.net/tier/14.svg"></td>
    <td align="center">7453</td>
    <td align="center">í©ì´ 0ì¸ ë¤ ì ì</td>
    <td align="center"><a href="https://www.acmicpc.net/problem/7453">ë°ë¡ê°ê¸°</a></td>
  </tr>
</table>

<br/><br/>

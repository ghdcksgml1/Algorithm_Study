#include <iostream>
#include <cmath>
using namespace std;

char map[10][10]; //값을 입력할 때 공백이 없으므로 문자로 입력받기

int n, m;

int answer = -1;  // 만약 제곱수가 없어 값이 갱신되지 않았다면 초기값인 -1을 출력할것임

bool isoutOfBounds(int x, int y) {
	if (x < 0 || x >= n || y < 0 || y >= m) {
		return true;
	}
	else {
		return false;
	}
}

bool isSquare(int value) {
	int sq = sqrt(value);

	if (sq * sq == value) { //루트를 씌운 정수값의 제곱이 원래 값과 같다면 제곱수
		return true;
	}
	else {
		return false;
	}
}
int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게(필수)
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	for (int i = 0; i < n; i++) {
		cin >> map[i];
	}

	for (int x = 0; x < n; x++) { //숫자가 시작되는 초기 x값
		for (int y = 0; y < m; y++) { //숫자가 시작되는 초기 y값
			for (int dx = -n; dx < n; dx++) { //행의 등차수열
				for (int dy = -m; dy < m; dy++) { //열의 등차수열

					if (dx == 0 && dy == 0) { //만약 
						continue;
					}
					int value = 0;

					int curX = x; //현재 x좌표 값
					int curY = y; //현재 y좌표 값

					while (!isoutOfBounds(curX, curY)) { //xy좌표가 행렬을 벗어나지 않는다면
						value = 10 * value + (map[curX][curY] - '0'); //값 갱신 ( 12에 3을 추가하려면 {12*10 + 3 = 123}과 같은 원리 ) 

						if (isSquare(value)) {
							answer = max(value, answer); //만약 더 값이 큰 제곱수라면 교환
						}
						curX += dx; //x좌표 갱신
						curY += dy; //y좌표 갱신
					}
				}
			}
		}
	}

	cout << answer;
}

//꿀팁이 있다면, 
//숫자 = 문자 - '0';
//문자 = 숫자 + '0'; 으로 쉽게 변환이 가능하다.

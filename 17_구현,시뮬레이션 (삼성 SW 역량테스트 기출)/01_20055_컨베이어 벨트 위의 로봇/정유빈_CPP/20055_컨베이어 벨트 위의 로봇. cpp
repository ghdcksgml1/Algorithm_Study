#include <iostream>
#include <deque>
using namespace std;

int n, k;
int num;

deque <int> naegu;
deque <bool> robot;


void rotate(){  	// 한 칸 회전하기	


	naegu.push_front(naegu.back());
	naegu.pop_back();

	robot.push_front(robot.back());
	robot.pop_back();
	robot[n - 1] = false; //n번칸 내리기

}

void move(){  //벨트가 회전하는 방향으로 한 칸 이동할 수 있다면 이동

	for (int i = n - 2; i >= 0; i--) {
		if ((!robot[i + 1]) && (naegu[i + 1] > 0) && (robot[i])) {
			robot[i] = false;
			robot[i + 1] = true;
			naegu[i + 1]--;
		}
	}
	robot[n - 1] = false; //만약 로봇이 내리는 위치에 도착한다면

}

void  put_robot() {
	//올라가는 위치에 로봇이 없다면 로봇을 하나 올린다.
	if (!robot[0] && naegu[0] > 0) {
		robot[0] = true;
		naegu[0]--;
	}
}

int check() { //내구도가 0인 칸의 개수 세기
	int count = 0;

	for (int i = 0; i < 2 * n; i++) {
		if (naegu[i] == 0) {
			count++;
		}
	}

	return count;
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int step = 1;


	cin >> n >> k;

	//내구도 입력받기
	for (int i = 0; i < 2 * n; i++) {
		cin >> num;
		naegu.push_back(num);
		robot.push_back(false);
	}


	while (true) {

		rotate();
		move();
		put_robot();

		if (check() >= k) {
			cout << step << "\n";
			break;
		}
		step++;
	}

	return 0;


}

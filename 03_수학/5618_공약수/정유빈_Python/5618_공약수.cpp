#include <iostream>

using namespace std;

int gcd(int a, int b) {
	int r = a % b;

	while (r != 0) {
		a = b;
		b = r;
		r = a % b;
	}
	
	return b;
}

int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n;
	cin >> n;

	int* array = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> array[i]; //배열 입력받기
	}

	if (n == 2) {
		int a = gcd(array[0], array[1]); //최대공약수 구하기
			for (int i = 1; i <= a; i++) { //최대공약수의 약수 (공약수) 구하기
				if (a % i == 0) {
					cout << i << "\n";
				}
			}
		}
	else if (n == 3) {
		int temp = gcd(array[0], array[1]); //두 수의 최대공약수 구하기
		int a = gcd(temp, array[2]); // 두 수의 최대공약수와 나머지 수의 최대공약수 구하기

		for (int i = 1; i <= a; i++) { //최대공약수의 약수(공약수) 구하기
			if (a % i == 0) {
				cout << i << "\n";
			}
		}
	}
}
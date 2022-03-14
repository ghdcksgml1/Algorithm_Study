#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N;
	cin >> N;

	if (N % 2 == 0) { //입력값이 짝수이면
		cout << "CY";
	}
	else {
		cout << "SK"; //입력값이 홀수이면
	}
	return 0;

}
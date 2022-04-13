#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int rnd(float value) { //반올림 함수 구현
	if (value > 0) 
		value += 0.5;

	else 
		value -= 0.5;
	
	return (int)value;

}


int main() {
	int n;
	cin >> n;

	int* array = new int[n];

	int sum = 0;

	for (int i = 0; i < n; i++) {
		cin >> array[i];
		sum += array[i];
	}

	float average = sum / double(n);

	cout << rnd(average) << "\n"; //소수점 이하 첫째 자리에서 반올림

	
	sort(array, array + n); //배열 오름차순 정렬


	int median = array[n / 2]; //중앙값
	cout << median << "\n";

	int mx = 0;

	vector <pair<int, int>> v; //원소와 횟수를 담는 벡터 선언
	for (int i = 0; i < n; i++) {
		int cnt = 0;
		for (int j = i; j < n; j++) {
			if (array[i] == array[j]) {
				cnt++;
			}
			else {
				break;
			}
		}
//		cout << array[i] << " 개수" << cnt << "\n";

		if (cnt > mx) { //횟수가 가장 크다면
			v.clear(); //벡터 모든 원소 제거
			v.push_back(make_pair(array[i], cnt));
			mx = cnt;
		}
		else if (cnt == mx) {
			v.push_back(make_pair(array[i], cnt));
		}

		i += cnt - 1;
	}


	if (v.size() == 1) { //최빈값이 하나라면
		cout << v[0].first << "\n";
	}
	else if (v.size() > 1) { //최빈값이 2개 이상이라면
		cout << v[1].first << "\n";
	}

	int max = array[n - 1]; //최댓값
	int min = array[0]; //최솟값
	int range = max - min; //범위
	cout << range << "\n"; //범위



}

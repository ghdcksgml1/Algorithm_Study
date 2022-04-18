#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

bool compare(string i, string j) {
	if (i.length() == j.length()) { //길이가 같으면
		return i < j; //사전순으로
	}
	else {
		return i.length() < j.length(); //길이가 짧은것부터
	}
}

int main() {

	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n;
	cin >> n;

	vector <string> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i];
	}

	sort(v.begin(), v.end(), compare); //배열 정렬


	for (int i = 0; i < n; i++) {
		cout << v[i] << "\n";
		for (int j = i + 1; j < n; j++) {
			if (v[j] == v[i]) { //반복되는 원소는 출력 안함 
				i = j;
			}
		}
	}
}
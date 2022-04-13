#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
	if (a.first == b.first) {
		return a.second < b.second; //첫번째 좌표가 같다면, 2번째 좌표가 증가하는 순으로 정렬
	}
	else {
		return a.first < b.first; //첫 번째 좌표가 증가하는 순으로 정렬
	}
}


int main() {

	int n;
	cin >> n;

	vector <pair<int, int>> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i].first >> v[i].second;
	}

	sort(v.begin(), v.end(), compare); //벡터 정렬
	for (int i = 0; i < n; i++) {
		cout << v[i].first << " " << v[i].second << "\n";
	}

}
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
	if (a.second == b.second) { //두 번째 인자가 같다면
		return a.first < b.first; //첫 번째 인자를 오름차순 정렬
	}
	else {
		return a.second < b.second; //두 번째 인자를 오름차순 정렬
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
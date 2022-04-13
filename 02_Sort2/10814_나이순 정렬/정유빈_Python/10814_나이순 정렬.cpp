#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

bool compare(pair<int, string> a, pair<int, string> b) {
	return a.first < b.first; //첫번째 인자 기준 오름차순 정렬
}

int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n;
	cin >> n;

	vector<pair<int, string>> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i].first >> v[i].second;
	}

	stable_sort(v.begin(), v.end(), compare); //첫번째 인자 기준 오름차순 정렬(안정화 정렬)

	for (int i = 0; i < n; i++) {
		cout << v[i].first << ' ' << v[i].second << "\n";
	}
}
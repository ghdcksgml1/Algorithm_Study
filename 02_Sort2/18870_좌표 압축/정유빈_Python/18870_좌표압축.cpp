#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;


int main() {

	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	int n;
	cin >> n;

	vector <int> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i];
	}

	vector <int> vt(n);

	vt = v; //벡터 전체 원소 복사
//	copy(v.begin(), v.end(), vt.begin());

	sort(vt.begin(), vt.end()); //벡터 정렬
	vt.erase(unique(vt.begin(), vt.end()), vt.end()); //벡터 중복 원소 제거


	for (int i = 0; i < n; i++) {
		int idx = lower_bound(vt.begin(), vt.end(), v[i]) - vt.begin(); //벡터 특정원소 위치 인덱스 찾기(find로 하면 시간초과)
		cout << idx << " ";
	}
}
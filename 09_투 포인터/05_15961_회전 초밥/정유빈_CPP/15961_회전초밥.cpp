#include <iostream>
#include <vector>
#include <cstring>
using namespace std;

int n, d, k, c;
int cnt = 0;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> d >> k >> c;

	vector <int> v;

	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}

	for (int i = 0; i < k - 1; i++) {
		v.push_back(v[i]);
	}


	int* array = new int[d + 1];

	for (int i = 0; i <= d; i++) {
		array[i] = 0;
	}

	for (int i = 0; i < k; i++) {
		if (array[v[i]] == 0) {
			cnt++;
		}
		array[v[i]]++;
	}

	int mx_cnt = cnt;

	int start = 0;
	int end = k - 1; //3

	while (start < n - 1) {
		end++;
		if (array[v[end]] == 0) {
			cnt++;
		}
		array[v[end]]++;
		array[v[start]]--;
		if (array[v[start]] == 0) {
			cnt--;
		}
		start++;

		if (array[c] == 0) {
			if (mx_cnt < cnt + 1) {
				mx_cnt = cnt + 1;
			}
		}
		else {
			if (mx_cnt < cnt) {
				mx_cnt = cnt;
			}
		}

	}

	cout << mx_cnt;



}

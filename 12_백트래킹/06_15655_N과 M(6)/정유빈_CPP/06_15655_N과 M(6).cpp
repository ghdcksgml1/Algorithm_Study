#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m, end_value;
int d = 1;
int arr[9] = { 0, };
bool isused[10001];

void hello(vector <int> vt) {
	
	for (int i = 0; i < vt.size(); i++) {
		isused[vt[i]] = false; //isused[2] = 0, isused[4] = 0, isused[5] = 0
	}
	
}


void func(int k) { //0
	if (k == m) {
		for (int i = 0; i < m; i++) {
			cout << arr[i] << ' ';
		}
		cout << "\n";
		return;
	}
	else {
		for (int i = d; i <= end_value; i++) {
			if (!isused[i]) { 
				arr[k] = i;
				isused[i] = 1;
				d = i + 1;
				func(k + 1);
				isused[i] = 0;
			}
		}
	}
}


int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m;

	vector <int> v(n);

	for (int i = 0; i < n; i++) {
		cin >> v[i]; // 4 5 2 
	}

	sort(v.begin(), v.end()); //v[0] = 2, v[1] = 4, v[2] = 5

	end_value = v[n - 1];

	for (int i = 0; i < 10001; i++) {
		isused[i] = 1; //isused 배열 모두 1로 초기화
	}

	hello(v); //hello(5)


	func(0);


}

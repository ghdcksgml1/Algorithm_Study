#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int n;
int ans = 0;
string st;


int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n;

	for (int i = 0; i < n; i++) {

		vector <int> v1;
		vector <int> v2;

		cin >> st;

		int cnt = 1;
		for (int j = 0; j < st.size(); j++) {
			if ((st[j] != st[j + 1]) || j == st.size()-1) {
				v1.push_back(cnt);
				cnt = 1;
			}
			else {
				cnt++;
			}
		}

		sort(st.begin(), st.end());
		
		for (int j = 0; j < st.size(); j++) {
			if ((st[j] != st[j + 1]) || j == st.size() - 1) {
				v2.push_back(cnt);
				cnt = 1;
			}
			else {
				cnt++;
			}
		}
		
		sort(v1.begin(), v1.end());
		sort(v2.begin(), v2.end());

		if (v1 == v2) {
			ans++;
		}

	}
	cout << ans;
}

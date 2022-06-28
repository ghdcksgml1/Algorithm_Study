#include <iostream>
#include <string>
#include <vector>
using namespace std;

int t;
int num;
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> t;

	for (int test_case = 0; test_case < t; test_case++) {
		int max = -1;
		string st;
		cin >> st;
		cin >> num;
		vector <int> count_arr[26];

		for (int i = 0; i < st.size(); i++) {
			int k = st[i] - '0' - 49;
			count_arr[k].push_back(i);
		}

		int min = 10000;
		for (int i = 0; i < 26; i++) {
			if (count_arr[i].size() >= num) {
				for (int j = 0; j <= count_arr[i].size() - num; j++) {
					int diff = count_arr[i][j + num - 1] - count_arr[i][j];

					if (diff > max)
						max = diff;
					if (min > diff)
						min = diff;
				}
			}
		}
	

		if (max == -1) {
			cout << max << "\n";
			continue;
		}
		else {
			cout << min + 1 << " " << max + 1 << "\n";
			continue;
		}
	}
}

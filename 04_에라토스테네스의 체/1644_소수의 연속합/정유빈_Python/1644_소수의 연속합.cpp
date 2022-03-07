#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int main(void) {
	int n, rt;
	vector <int> v;

	cin >> n;

	if (n == 1) {
		cout << "0";
		return 0;
	}

	for (int i = 2; i <= n; i++) {
		rt = sqrt(i);
		if (rt == 1 && i != 1) {
			v.push_back(i);
			continue;
		}
		if (i % 2) {
			for (int j = 2; j <= rt; j++) {
				if ((i % j) == 0)
					break;
				if (j == rt) {
					v.push_back(i);
				}
			}
		}
	}

	int count = 0;
	int start = 0, end = 0;
	int sum = 0;

	while (start <= end && end < v.size())
	{
		if (sum < n) {
			sum += v[end];
			end++;
			continue;
		}
		else if (sum >= n) {
			if (sum == n) {
				count++;
			}
			sum -= v[start];
			start++;
			continue;
		}
	}
	if (v[v.size() - 1] == n) {
		count++;
	}

	cout << count;
}



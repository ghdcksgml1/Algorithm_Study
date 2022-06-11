#include <iostream>

using namespace std;

int a, b, c, d, e, f;
char ch;
int h, m, s;
int h1, m1, s1;
int h2, m2, s2;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> a >> ch >> b >> ch >> c;
	cin >> d >> ch >> e >> ch >> f;

	if ((a < d) || ((a == d) && (b < e)) || ((a == d) && (b == e) && (c < f))) {
		if (f >= c) {
			s = f - c;
			if (e >= b) {
				m = e - b;
				h = d - a;
			}
			else {
				m = 60 + e - b;
				d--;
				h = d - a;
			}
		}
		else {
			s = 60 + f - c;
			e--;
			if (e >= b) {
				m = e - b;
				h = d - a;
			}
			else {
				m = 60 + e - b;
				d--;
				h = d - a;
			}
		}
	}
	else {
		if (c == 0) {
			s1 = 0;
			if (b == 0) {
				m1 = 0;
				h1 = 24 - a;
			}
			else {
				m1 = 60 - b;
				h1 = 23 - a;
			}
		}
		else {
			s1 = 60 - c;
			m1 = 59 - b;
			h1 = 23 - a;
		}
		
		int h2 = h1 + d;
		int m2 = m1 + e;
		int s2 = s1 + f;
		
		if (s2 < 60) {
			s = s2;
			if (m2 < 60) {
				m = m2;
				h = h2;
			}
			else {
				m = m2 - 60;
				h = h2 + 1;
			}
		}
		else{
			s = s2 - 60; //2
			m2++;
			if (m2 < 60) {
				m = m2;
				h = h2;
			}
			else {
				m = m2 - 60;
				h = h2 + 1;
			}
		}		
	}

	if (h < 10) {
		cout << "0" << h << ":";
	}
	else {
		cout << h << ":";
	}
	if (m < 10) {
		cout << "0" << m << ":";
	}
	else {
		cout << m << ":";
	}
	if (s < 10) {
		cout << "0" << s;
	}
	else {
		cout << s;
	}
}

#include <iostream>

using namespace std;

string st;
int n;

int cntA, indexA, cntF, indexC, indexF, cntC;
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	/**
	  * A,B,C,D,E,F 중 0개 또는 1개로 시작
	  * A 다음에는 F, F 다음에는 C 가 와야한다
	  * C로 끝날 수도 있고 C 다음에 ABDEF 중 하나가 올 수도 있따
	  */

	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> st;

		if (st[0] != 'A' && st[0] != 'B' && st[0] != 'C' &&
			st[0] != 'D' && st[0] != 'E' && st[0] == 'F')
		{
			cout << "Good!" << "\n";
			continue;
		}

		if (st.find("A") == string::npos) {
			cout << "Good" << "\n";
			continue;
		}
		else {
			indexA = st.find("A");
			cntA = 0;
			for (int i = indexA + 1; i < st.size(); i++) {
				if (st[i] == 'A') {
					cntA++;
				}
				else {
					break;
				}
			}
		}

		if (st.find("F") == string::npos) {
			cout << "Good" << "\n";
			continue;
		}
		else {
			indexF = st.find("F");
			cntF = 0;
			for (int i = indexF + 1; i < st.size(); i++) {
				if (st[i] == 'F') {
					cntF++;
				}
				else {
					break;
				}
			}
		}

		if (st.find("C") == string::npos) {
			cout << "Good" << "\n";
			continue;
		}
		else {
			indexC = st.find("C");
			cntC = 0;
			for (int i = indexC + 1; i < st.size(); i++) {
				if (st[i] == 'C') {
					cntC++;
				}
				else {
					break;
				}
			}
		}

		if (cntA != indexF - indexA - 1) { 
			cout << "Good" << "\n";
			continue;
		}
		if (cntF != indexC - indexF - 1) {
			cout << "Good" << "\n";
			continue;
		}

		st.erase(0, indexC + cntC + 1);

		if (st.size() >= 2) {
			cout << "Good" << "\n";
			continue;
		}
		else {
			if (st.size() == 0) {
				cout << "Infected!" << "\n";
			}
			else {
				if (st[0] == 'A' || st[0] == 'B' || st[0] == 'C' ||
					st[0] == 'D' || st[0] == 'E') {
					cout << "Infected!" << "\n";
				}
				else {
					cout << "Good" << "\n";
				}
			}
		}
	}

}

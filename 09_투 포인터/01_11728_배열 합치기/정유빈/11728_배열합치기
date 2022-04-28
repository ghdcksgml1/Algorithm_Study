#include <iostream>
#include <vector>
#include <algorithm>

int n, m;
using namespace std;
void TwoPointer(vector<int> &A, vector<int> &B)
{

	sort(A.begin(), A.end()); // A 벡터 정렬
	sort(B.begin(), B.end()); // B 벡터 정렬

	int ptrA = 0; // A 원소 위치 가르키는 포인터
	int ptrB = 0; // B 원소 위치 가르키는 포인터

	vector <int> answer(n + m); // A와 B 벡터를 합친 벡터
	int idx = 0;

	while (ptrA < n && ptrB < m) { //둘다 가르키는 포인터가 있을 때까지
		if (A[ptrA] < B[ptrB]) {
			answer[idx] = A[ptrA]; // A 벡터 원소를 answer 벡터에 
			idx++;
			ptrA++;
		}
		else {
			answer[idx] = B[ptrB]; // B 벡터 원소를 answer
			idx++;
			ptrB++;
		}
	}

	while (ptrA < n) { // A벡터를 다 순회하지 못했다면
		answer[idx] = A[ptrA]; 
		idx++;
		ptrA++;
	}
	while (ptrB < m) { // B벡터를 다 순회하지 못했다면
		answer[idx] = B[ptrB];
		idx++; //answer 벡터 포인터 이동
		ptrB++; //B 벡터 포인터 이동
	}

	for (int i : answer)
		cout << i << " "; //answer 모든 벡터 원소 출력
}


int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m; //벡터 A의 크기 >> 벡터 B의 크기

	vector <int> A(n);
	for (int i = 0; i < n; i++) {
		cin >> A[i];
	}

	vector <int> B(m);
	for (int i = 0; i < m; i++) {
		cin >> B[i];
	}

	TwoPointer(A, B);
}

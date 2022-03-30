#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m;

void TwoPointer(vector<int> &A, vector<int> &B) {

	sort(A.begin(), A.end()); //TwoPointer의 첫번째 인자인 벡터A 정렬
	sort(B.begin(), B.end()); //TwoPointer의 두번째 인자인 벡터B 정렬

	int ptrA = 0; //벡터 A의 원소를 가르키는 ptrA
	int ptrB = 0; //벡터 B의 원소를 가르키는 포인터B

	vector <int> answer(n + m); //벡터A와 벡터B를 합친 벡터 answer
	int idx = 0; //벡터 answer을 가르키는 포인터 idx

	while (ptrA < n && ptrB < m) //포인터가 벡터 마지막 원소를 가르킬 때까지
	{
		if (A[ptrA] < B[ptrB]) { //포인터A가 가르키는 벡터 A의 원소가 포인터B가 가르키는 벡터 B의 원소보다 더 작으면
			answer[idx] = A[ptrA]; // 벡터 answer에 포인터A가 가르키는 벡터A 의 원소 추가
			idx++; //벡터 answer을 가르키는 포인터A 오른쪽으로 한 칸 이동
			ptrA++;
		}
		else { //포인터B가 가르키는 벡터 B의 원소가 포인터A가 가르키는 벡터 A의 원소보다 더 작으면
			answer[idx] = B[ptrB];  // 벡터 answer에 포인터B가 가르키는 벡터A 의 원소 추가
			idx++; //벡터 answer을 가르키는 포인터B 오른쪽으로 한 칸 이동
			ptrB++;
		}
	}

	while (ptrA < n) {
		answer[idx] = A[ptrA];
		idx++;
		ptrA++;
	}

	while (ptrB < m) {
		answer[idx] = B[ptrB];
		idx++;
		ptrB++;
	}

	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i];
	}
}


int main() {
	ios_base::sync_with_stdio(0); //입출력 빠르게
	cin.tie(0);
	cout.tie(0);

	cin >> n >> m; // 벡터 A의 크기 >> 벡터 B의 크기

	vector<int> A(n);  //크기가 n인 벡터A 선언
	for (int i = 0; i < n; i++) {
		cin >> A[i];
	}

	vector<int> B(m); //크기가 m인 벡터B 선언
	for (int i = 0; i < m; i++) {
		cin >> B[i];
	}

	TwoPointer(A, B);
}

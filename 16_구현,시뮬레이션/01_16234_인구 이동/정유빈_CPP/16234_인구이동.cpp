#include <iostream>
#include <queue>
#include <vector>
using namespace std;

int n, l, r;
int arr[101][101];
bool visited[101][101]= { false, };

int dx[4] = { 1,-1,0,0 };
int dy[4] = { 0,0,1,-1 };
int sum;

queue <pair<int, int>> q;

vector <pair<int, int>> v;

void bfs(int x, int y) {

	sum += arr[x][y];
	q.push(make_pair(x, y));
	visited[x][y] = 1;
	v.push_back(make_pair(x, y));

	while (!q.empty()) {

		int a = q.front().first;
		int b = q.front().second;

		q.pop();

		for (int i = 0; i < 4; i++) {
			int nx = a + dx[i];
			int ny = b + dy[i];

			if (0 <= nx && nx < n && 0 <= ny && ny < n
				&& visited[nx][ny] == 0 && (abs(arr[nx][ny] - arr[a][b]) >= l)
				&& (abs(arr[nx][ny] - arr[a][b]) <= r)) 
			{
				sum += arr[nx][ny];
				v.push_back(make_pair(nx, ny));
				visited[nx][ny] = 1;
				q.push(make_pair(nx, ny));
			}

		}
	}

}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	cin >> n >> l >> r;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> arr[i][j];
		}
	}

	int answer = 0;
	while (1) {

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == 0) {
					v.clear();
					sum = 0;
					bfs(i, j);

					if (v.size() > 1) {
						cnt++;
					}
					int k = sum / v.size();
					for (int i = 0; i < v.size(); i++) {
						arr[v[i].first][v[i].second] = k;
					}

				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = 0;
			}
		}


		if (cnt == 0) {
			break;
		}
		answer++;
	}
	
	cout << answer << "\n";
}

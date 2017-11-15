
#include <iostream>

using namespace std;

int dp[31][31];
char grid[30][30];
int lastBlue[30];

int m,n;

void calc_dp() {
	// dp[r][c] := #solutions for first r rows (0..r-1) where at most first c columns (0..c-1) of row r-1 is blue.
	for (int j=0;j<n;j++) {
		dp[0][j] = 0;
	}
	dp[0][n] = 1;
	for (int i =1;i<=m;i++) {
		bool seenRed = false;
		for (int j =0;j<=n;j++) {
			if (j>0 && grid[i-1][j-1]=='R') {
				seenRed = true;
			}
			if (seenRed || j<=lastBlue[i-1]) {
				dp[i][j] = j>0? dp[i][j-1]: 0;
			}else {
				dp[i][j] = dp[i-1][n];
				if (j>0) {
					dp[i][j] += dp[i][j-1] - dp[i-1][j-1];
				}
			}
			// cout << i << " " << j << " " << dp[i][j] << endl; 
		}
	}
}

int main() {
	cin >> m >> n;

	for (int i =0;i<m;i++) {
		for(int j =0;j<n;j++) {
			cin >> grid[i][j];
			// cout << grid[i][j];
		}
	}
	fill_n(lastBlue, m, -1);
	for (int i =0;i<m;i++) {
		for (int j = n-1;j>=0;j--) {
			if (grid[i][j]=='B') {
				lastBlue[i] = j;
				break;
			}
		}
	}
	calc_dp();
	cout << dp[m][n] << endl;
	return 0;
}



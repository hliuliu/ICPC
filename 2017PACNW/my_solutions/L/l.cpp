#include <cstdio>
#include <cmath>
#include <iostream>

using namespace std;

int main() {
	int k,p,x;
	cin >> k >> p >> x;
	int m =  (sqrt(k*p/ (double)x));
	double a1= m*x+k*p/(double)m;
	m++;
	double a2 = m*x+k*p/(double)m;
	printf("%.3f\n", min(a1,a2));
	return 0;
}


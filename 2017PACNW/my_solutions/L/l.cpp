#include <cstdio>
#include <cmath>
#include <iostream>

using namespace std;

int main() {
	int k,p,x;
	cin >> k >> p >> x;
	double m =  round(sqrt(k*p/(double) x));
	printf("%.3f\n", m*x+k*p/m);
	return 0;
}


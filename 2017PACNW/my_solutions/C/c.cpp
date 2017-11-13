#include <iostream>
#include <cmath>

using namespace std;
typedef long long LL;

LL tri(LL a, LL b) {
	return (b*(b+1)-a*(a+1))>>1;
}

int main() {
	LL a ,b , m;
	cin >> a >> b;
	m = sqrt(b);
	LL s =0;
	for (int f =1;f<=m;f++) {
		s+= f*(b/f-(a-1)/f)+tri(max(m,(a-1)/f),max(m,b/f));
	}
	cout << s << endl;
	return 0;
}


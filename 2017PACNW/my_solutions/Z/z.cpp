
#include <iostream>

using namespace std;


int getNext(int n) {
	if (n%10<9) {
		return n+1;
	}
	return getNext(n/10)*10+1;
}


int main() {
	int n;
	cin >> n;
	cout << getNext(n) << endl;
	return 0;
}



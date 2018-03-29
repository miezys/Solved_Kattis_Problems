/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/grassseed
*/

#include <iostream>
#include <iomanip>

using namespace std;
int main() {

    double c, w, l;
    int n;

    cin >> c >> n;

    double tmp=0;
    for(int i=0; i<n; i++){
        cin >> w >> l;
        tmp += w*l;
    }
    cout << fixed << setprecision(7);
    cout << tmp*c;
    return 0;
}
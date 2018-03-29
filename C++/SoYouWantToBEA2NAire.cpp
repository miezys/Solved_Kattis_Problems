/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/2naire
*/

#include <bits/stdc++.h>
using namespace std;
int main( ){
    cout << setprecision(3) << fixed;
//round to 3 digit after comma
    int n;
// number of questions
    double t;
// p uniformly distributed in [t,1]
    while (cin >>  n >> t){
        if
                (n == 0 && t == 0)
            break;
// terminated case
        double a;
// expectation when there are i questions remaining
        a = pow(2,n);
// no question left

        for (int i=1  ; i<=n  ; ++i){
// calculate a[1] to a[n]
            double e = pow(2,n - i)/a;
            if (e < t)
// answer question
                a = (1 + t)/2 * a;
            else
// maybe answer or quit
                a = (e - t)/(1 - t)*
                    pow
                            (2,n - i) + (1 - e)/(1 - t) * (e + 1)/2 * a;
        }
        cout <<  a << endl;
    }
}
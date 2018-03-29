/*
	Author Erlandas Miezys
	https://open.kattis.com/problems/a1paper
*/

#include<bits/stdc++.h>
using namespace std;

int nrA[40];
// nrA[i] number of papers in size A[i]
int n;
// Smallest size An
double l[40];
// l[i] = length of A[i]
double w[40];
// w[i] = width of A[i]
double res=0.0;
// result = length of tape
void setupSize(){
    w[2] = 1/ pow(pow(2.0,5.0),1.0/4.0);
// width of A2
    l[2] = 1/ pow(pow(2.0,3.0),1.0/4.0);
// length of A2
    for (int i=3; i<=32; ++i) {
// setup for other size
        l[i] = w[i - 1];
        w[i] = l[i - 1]/2;
    }
}

void cal(int s){
// calculate length of tape to make all papers in size As
    if (nrA[s]>=0) return; // do not lack this size // -> finish
    if (s>n){ // do not have this size -> impossible
        res= -1.0;
        return;
    }
    res -= nrA[s]*l[s+1];
// do not have enough-> cut into 2 smaller-> lengthof needed tape
    nrA[s+1]+=nrA[s]*2;
// calculate number of needed smaller papers
    return cal(s+1);
// calculate length of tape for needed smaller papers
}
int main( ){
    cout << setprecision(10)<<fixed;
// make sure error at most 10^-5
    setupSize( );
// set up size of papers
    cin >>n;
    for (int i=2; i<=n; ++i)
        cin >>nrA[i];
// input
    nrA[1] = -1;
// need 1 paper in size A1
    cal(1);
// deploy the DP
    if (res<0)cout << "impossible";
    else cout << res;
}
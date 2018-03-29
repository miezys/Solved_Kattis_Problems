/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/divisible
*/

#include <bits/stdc++.h>
using namespace std; 
typedef long long Long; 

int run, d, n; 
int sum[50100]; 
int nr[1000100]; 

int main( ){ 
cin >> run; 
// number of testes
while (run--){ 
cin >> d >> n; 
// input + make contiguous sums mod d
for (int i = 0; i < d; ++i) nr[i] = 0; 
cin >> sum[0];  sum[0] %= d;  ++nr[sum[0]]; 
for (int i = 1; i <= n - 1; ++i){ 
cin >> sum[i]; sum[i] %= d;  sum[i] += sum[i - 1];  sum[i] %= d; 
++nr[sum[i]]; 
// add number of this sum
} 
int res = (nr[0] + 1) * nr[0] / 2; 
//made by 2 or 1 subsequence
for (int i = 1; i <= d - 1; ++i) res += (nr[i]) * (nr[i] - 1) / 2; 
//made by 2 subsequences
cout << res << endl; 
}
}
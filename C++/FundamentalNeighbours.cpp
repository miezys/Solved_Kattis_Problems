/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/fundamentalneighbors
*/

#include <bits/stdc++.h>
typedef long long Long;

using namespace std;

Long n;

void print(){
        Long twos = 0; Long result = 1;

        while (n%2 == 0){
            twos++;
            n/=2;
        }
        if (twos != 0) result = pow(twos,2);

        for(Long i = 3; i<= sqrt(n); i=i+2){
            int counter = 0;
            while(n%i == 0){
                n=n/i;
                counter++;
            }

            if (counter != 0){
                double erg = pow(counter,i);
                result = result * erg;
            }
        }

        if(n>2){
            double erg = pow(1,n);
            result = result * erg;
        }

        cout << result;
}

int main() {

    while(cin >> n) {
        cout << n << " ";
        print();
        cout<<endl;
    }
   return 0;
}
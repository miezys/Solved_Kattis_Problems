/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/primalrepresentation
*/

#include <bits/stdc++.h>
typedef long long Long;

using namespace std;

Long n;

void print(){
    Long twos = 0; Long result = 1;

    if(n<0){
        cout << "-1 ";
        n = abs(n);
    }

    // if n is divisable by two, count divisors

    while (n%2 == 0){
        if(twos == 0){
            cout << "2";
        }
        twos++;
        n/=2;
    }

    if(twos > 1){
        cout << "^" << twos;
    }
    
    // n is not divisable by two, count odds

    for(Long i = 3; i<= sqrt(n); i=i+2){
        int counter = 0;
        while(n%i == 0){
            n=n/i;
            counter++;
        }

        if (counter != 0){

            if(counter == 1){
                cout << " " << i;
            }
            else{
                cout << " "<< i << "^" << counter;
            }
        }
    }

    // rest must be prime number

    if(n>2){
        cout << " " << n;
    }

}

int main() {

    while(cin >> n) {
        print();
        cout<<endl;
    }
    return 0;
}
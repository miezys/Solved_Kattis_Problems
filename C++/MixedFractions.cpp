/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/mixedfractions
*/

#include <bits/stdc++.h>
typedef long long Long;

using namespace std;

Long numerator;
Long denominator;
Long integer;

void proper(){
    cout << "0" << " "<< numerator << " " << "/" << " " << denominator << endl;
}
void inproper(){
    integer = numerator / denominator;
    numerator = numerator - (integer * denominator);
    cout <<integer << " " << numerator << " " << "/" << " " << denominator << endl;
}

int main() {

    cin >> numerator;
    cin.ignore();
    cin >> denominator;


    while(numerator != 0 && denominator != 0){
        cout << numerator / denominator << " " <<
                numerator % denominator << " " << "/" << " " <<
                denominator << endl;

        cin >> numerator;
        cin.ignore();
        cin >> denominator;
    }


    return 0;
}
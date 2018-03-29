/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/dicegame
*/

#include <iostream>

using namespace std;

int main() {

    int a1,b1,a2,b2;

    cin >> a1 >> b1 >> a2 >> b2 ;
    int gunnar = a1+b1+a2+b2;

    cin >> a1 >> b1 >> a2 >> b2 ;
    int emma = a1+b1+a2+b2;

    if(emma > gunnar){
        cout << "Emma";
    }
    else if(emma < gunnar){
        cout << "Gunnar";
    }
    else{
        cout << "tie";
    }
    return 0;
}
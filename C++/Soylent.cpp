/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/soylent
*/

#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;
    for (int i=0; i<n; i++){
        int input;
        int output;
        cin >> input;
        if(input%400 != 0){
            output = (input/400) + 1;
            cout << output << endl;
        }
        else if (input%400 == 0){
            output = input/400;
            cout << output << endl;
        }
    }

}
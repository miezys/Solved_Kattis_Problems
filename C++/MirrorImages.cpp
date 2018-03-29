/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/mirror
*/

#include <bits/stdc++.h>

using namespace std;

int t, r, c;

int main() {

    cin >> t;

    for(int i=1; i<=t; i++){
        cin >> r;
        cin.ignore();
        cin >> c;
        cout << "Test " << i << endl;
        string str;
        string result;
        for (int j=0; j<r; j++){
            cin >> str;
            result.append(str);
        }
        int count = 1;
        for(string :: reverse_iterator it = result.rbegin(); it != result.rend(); ++it){
            cout << (*it);
            if(count % c == 0){
                cout << endl;
            }
            count++;
        }
        cout << endl;
    }


    return 0;
}


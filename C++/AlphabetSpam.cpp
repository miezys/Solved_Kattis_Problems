/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/alphabetspam
*/

#include <bits/stdc++.h>

using namespace std;

int main(){
    string str;
    int space,lowercase,uppercase,symbols
    ;
    space = lowercase = uppercase = symbols = 0;
    cin >> str;
    for (int i=0;i<str.size();i++){
        if (str.at(i) == '_')
            space++;
        else if (islower(str.at(i)))
            lowercase++;
        else if (isupper(str.at(i)))
            uppercase++;
        else
            symbols++;
    }
    cout.precision(15);
    cout << (double)space/str.size() << endl;
    cout << (double)lowercase/str.size() << endl;
    cout << (double)uppercase/str.size() << endl;
    cout << (double)symbols/str.size() << endl;

    return 0;
}
/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/egypt
*/

#include <stdio.h>
#include <math.h>
typedef int bool;
#define true 1
#define false 0

bool pytagoras(int a, int b, int c){
    bool result = false;
    if((pow(a, 2) + pow(b, 2)) == pow(c, 2)) result = true;
    else if((pow(a, 2) + pow(c, 2)) == pow(b, 2)) result = true;
    else if((pow(b, 2) + pow(c, 2)) == pow(a, 2)) result = true;
    return result;   
    }

int main(void){
    
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    
    while(a!=0 && b!=0 && c!=0){    
        if(pytagoras(a,b,c)) printf("right\n");
        else printf("wrong\n");
        scanf("%d %d %d", &a, &b, &c);
        }
    
    return 0;
    }
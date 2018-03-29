/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/applesack
*/

 
 /**
  * pile of N apples
  * sack, that can hold K apples at a time
  * 
  * at each km -> toll -> one apple
  * if he goes back -> no pay
  * 
  * Example: 8 apples, sack can carry 4 apples
  * 
  * pick 4 apples -> go until 3 km mark = dump remaining 2 apples
  * go back, pickup remaining -> do the same
  * then at 3 km mark he has 4 apples
  * 
  * 
  */

#include <stdio.h>
#include <string.h>
#include <math.h>
typedef int bool;
#define true 1
#define false 0

int main(void){
    
    int n, k;
    scanf("%d", &n);
    scanf("%d", &k);
    int count = 0;
    while(n>k){
        if(n%k == 0) n -= floor(n/k);
        else n -= floor(n/k) + 1;
        count++;
        }
    count += n;
    printf("%d\n", count+1);
    
    return 0;
    }

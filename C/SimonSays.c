/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/simonsays
*/

#include <stdio.h>
#include <string.h>
typedef int bool;
#define true 1
#define false 0

char* simonsays = "Simon says";

bool simonSays(char* input){
    bool result = true;
    int lenght = strlen(simonsays);
    int i;
    for(i=0; i<lenght; i++){
        if(simonsays[i] != input[i])
            result = false;
        }
        
        return result;
    }

int main(void){
    
    size_t i,n;
    scanf("%zu", &n);
    // discarding new line
    scanf("%*c");
    for(i=0; i<n; i++){
        char input[100];
        fgets(input, 100, stdin);
        if(simonSays(input)){
            int j;
            for(j=11; j<strlen(input)-1; j++){
                printf("%c", input[j]);
                }
            printf("\n");
            }
        }
    
    return 0;
    }
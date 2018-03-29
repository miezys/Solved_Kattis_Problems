/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/cold
*/

import java.util.Scanner;

public class Coldputer{
    public static void main (String[] args){
        Scanner data= new Scanner(System.in);
        int n = data.nextInt();
        int count=0, aux;
        for(int i=0; i<n; i++){
            aux=data.nextInt();
            if(aux<0)
                count++;
        }
        System.out.print(count);
    }
    
}
/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/tarifa
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();       // megabytes allowed to use
        int n = reader.nextInt();       // # of months
        int rest = 0;                   // allowed to spend
        
        for (int i = 0; i<n; i++){
            int p = reader.nextInt();   // used mb this month
            rest = rest + (x - p);
        }     
        System.out.println(rest+x);
    }
}
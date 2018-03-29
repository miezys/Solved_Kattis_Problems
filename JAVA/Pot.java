/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/pot
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = 0;
        
        
        for (int i=0; i<n; i++){
            int values = reader.nextInt();
            int pow = (values%10);
            int base = (values/10);
            sum = (int) (sum + Math.pow(base, pow));
        }
        System.out.println(sum);

    }
}
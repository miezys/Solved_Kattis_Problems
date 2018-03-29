/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/sumkindofproblem
*/

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int p = reader.nextInt();
        for(int i=0; i<p; i++){
            int k = reader.nextInt();
            int n = reader.nextInt();
            System.out.print(k + " ");
            System.out.print((n*(n+1))/2 + " ");
            System.out.print((int)Math.pow(n, 2) + " ");
            System.out.println(n*(n+1));
        }
    }
}
/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/timeloop
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        for (int i = 1; i<=n; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
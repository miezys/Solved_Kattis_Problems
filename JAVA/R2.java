/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/r2
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int r1 = reader.nextInt();
        int s = reader.nextInt();
        
        System.out.println((s*2)-r1);

    }
}
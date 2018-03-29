/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/spavanac
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int h = reader.nextInt();
        int m = reader.nextInt();
        
        if (m < 45 && h > 0){
            h -= 1;
            m = m + 60 - 45;
        }
        else if(m < 45 && h == 0){
            h = 23;
            m = m + 60 - 45;
        }
        else if(m > 45){
            m -= 45;
        }
        
        System.out.println(h + " " + m);
    }
}
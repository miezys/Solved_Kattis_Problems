/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/filip
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Filip {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        StringTokenizer tokenizer = new StringTokenizer(reader.nextLine());

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        boolean found = false;
        int tmpA = a, tmpB = b, result = 0;
        while(!found){
                if(tmpA%10 > tmpB%10){
                    found = true;
                    result = a;
                }
                else if(tmpA%10 < tmpB%10){
                    found = true;
                    result = b;
                }
                else if(tmpA%10==tmpB%10){
                    tmpA =tmpA/10; tmpB = tmpB/10;
                }
        }
        while (result > 0) {
            System.out.print( result % 10);
            result = result / 10;
        }
    }
}
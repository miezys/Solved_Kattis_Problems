/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/howmanydigits
*/

import java.util.Scanner;

public class ProgEx {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double[] facTable = new double[1000005];
        facTable[0] = 0;
        for (int i=1; i<1000005; i++){
            facTable[i] += facTable[i-1] + Math.log10(i);
        }

        while (s.hasNextInt()) {
            int a = s.nextInt();
            System.out.println((int)facTable[a]+1);
        }
    }

}
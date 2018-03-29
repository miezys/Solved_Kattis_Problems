/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/different
*/

import java.math.BigInteger;
import java.util.Scanner;

public class AdifferentProblem {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()){
            BigInteger a = reader.nextBigInteger();
            BigInteger b = reader.nextBigInteger();

            BigInteger answer = a.subtract(b);
            answer = answer.abs();
            System.out.println(answer);
        }

    }
}
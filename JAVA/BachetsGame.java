/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/bachetsgame
*/

import java.util.Scanner;

public class Bachetsgame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (reader.hasNext()) {

            int stones = reader.nextInt();
            boolean[] dp = new boolean[stones + 1];
            int possSize = reader.nextInt();
            int[] sts = new int[possSize];
            for (int i = 0; i < sts.length; i++)
                sts[i] = reader.nextInt();


            for (int i = 0; i < stones + 1; i++)
                for (int j = 0; j < sts.length; j++) {
                    if(i+sts[j]<=stones){
                        dp[i+sts[j]] |= !dp[i];
                    }
                }
            if(dp[stones])
                System.out.println("Stan wins");
            else
                System.out.println("Ollie wins");

        }
    }
}
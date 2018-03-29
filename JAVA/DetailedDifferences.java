/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/conundrum
*/

import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int i=0;i<n; i++){

            String input1 = reader.nextLine();
            String input2 = reader.nextLine();
            System.out.println(input1);
            System.out.println(input2);

            for(int j=0; j<input1.length(); j++){
                if(input1.charAt(j) == input2.charAt(j)){
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
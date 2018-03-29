/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/leftbeehind
*/

import java.util.Scanner;


public class LeftBeehing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        while (true) {
            int sweet = reader.nextInt();
            int sour = reader.nextInt();

            if(sweet == 0 && sour == 0) break;

            if (sweet + sour == 13){
                System.out.println("Never speak again.");
            }
            else if (sweet == sour){
                System.out.println("Undecided.");
            }
            else if (sweet > sour){
                System.out.println("To the convention.");
            }
            else{
                System.out.println("Left beehind.");

            }
        }
    }
}
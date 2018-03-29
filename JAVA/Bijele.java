/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/bijele
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int king = reader.nextInt();
        int queen = reader.nextInt();
        int rooks = reader.nextInt();
        int bishops = reader.nextInt();
        int knights = reader.nextInt();
        int pawns = reader.nextInt();
        
        
        System.out.print(1-king + " ");
        System.out.print(1-queen + " ");
        System.out.print(2-rooks + " ");
        System.out.print(2-bishops + " ");
        System.out.print(2-knights + " ");
        System.out.print(8-pawns);

    }
}
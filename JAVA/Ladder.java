/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/ladder
*/

import java.util.HashSet;
import java.util.Scanner;


public class ProgEx {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double h, v;

        h = reader.nextDouble();
        v = reader.nextDouble();
        v = Math.toRadians(v);
        int ladderLenght = (int) Math.ceil(h/Math.sin(v));
        System.out.println(ladderLenght);
    }
}
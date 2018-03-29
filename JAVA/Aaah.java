/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/aaah
*/

import java.util.Scanner;

public class Aaah {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String marius = reader.nextLine();
        String doctor = reader.nextLine();
        System.out.println((marius.length() >= doctor.length()) ? "go" : "no");
    }
}
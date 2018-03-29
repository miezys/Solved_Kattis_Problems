/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/abc
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Abc {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(reader.nextInt());
        ints.add(reader.nextInt());
        ints.add(reader.nextInt());
        Collections.sort(ints);

        //System.out.println(ints);

        reader.nextLine();
        String reding = reader.nextLine();
        String[] input = reding.split("");


        int a, b, c;

        if(input[0].equals("A")){
            a = ints.get(0);

        } else if(input[0].equals("B")){
            a = ints.get(1);
        } else {
            a = ints.get(2);
        }

        if(input[1].equals("A")){
            b = ints.get(0);
        } else if(input[1].equals( "B")){
            b = ints.get(1);
        } else {
            b = ints.get(2);
        }

        if(input[2].equals( "A")){
            c = ints.get(0);
        } else if(input[2].equals("B")){
            c = ints.get(1);
        } else {
            c = ints.get(2);
        }

        System.out.println(a + " " + b +  " " + c);

    }
}
/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/akcija
*/

import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] books = new int[n];

        for(int i=0; i<n; i++){
            books[i] = reader.nextInt();
        }

        Arrays.sort(books);

        long price=0;

        for(int i=0; i<books.length; i++){
            if(i%3 == books.length%3){
                continue;
            }
            price += books[i];
        }

        System.out.println(price);
    }

}
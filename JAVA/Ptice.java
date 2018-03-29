/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/ptice
*/

import java.util.Scanner;

//Ugly solution

public class Ptice {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        String adr = "A B C ", br = "B A B C ", gor = "C C A A B B ";


        for(int i=0; i<n; i++){
            adr += "A B C ";
            br +=  "B A B C ";
            gor += "C C A A B B ";
        }

        String[] adrian = adr.split(" ");
        String[] bruno = br.split(" ");
        String[] goran = gor.split(" ");

        String inp = reader.nextLine();
        String[] input = inp.split("");

        int countAdr=0, countBr=0, countGor=0;

        for(int i=0; i<n; i++){
            if(adrian[i].equals(input[i])){
                countAdr++;
            }
            if(bruno[i].equals(input[i])){
                countBr++;
            }
            if(goran[i].equals(input[i])){
                countGor++;
            }
        }
        
        if(countAdr > countBr && countAdr > countGor ){
            System.out.println(countAdr);
            System.out.println("Adrian");
        }
        else if(countBr > countAdr && countBr > countGor){
            System.out.println(countBr);
            System.out.println("Bruno");
        }
        else if(countGor > countAdr && countGor > countBr){
            System.out.println(countGor);
            System.out.println("Goran");
        }
        else if(countAdr == countBr && countAdr == countGor){
            System.out.println(countAdr);
            System.out.println("Adrian");
            System.out.println("Bruno");
            System.out.println("Goran");
        }
        else if(countAdr == countBr && countAdr > countGor){
            System.out.println(countAdr);
            System.out.println("Adrian");
            System.out.println("Bruno");
        }
        else if(countAdr == countGor && countAdr > countBr){
            System.out.println(countAdr);
            System.out.println("Adrian");
            System.out.println("Goran");
        }
        else if(countBr == countGor && countBr > countAdr){
            System.out.println(countBr);
            System.out.println("Bruno");
            System.out.println("Goran");
        }
    }
}
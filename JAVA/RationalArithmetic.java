/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/rationalarithmetic
*/

import java.util.Scanner;

public class RationalArithmetic {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for(int i=0;i<n;i++){

            long x1 = reader.nextLong();
            long y1 = reader.nextLong();
            String op = reader.next();
            long x2 = reader.nextLong();
            long y2 = reader.nextLong();

            switch (op){
               case "+": add(x1,y1,x2,y2);
               break;
               case "-": subtract(x1,y1,x2,y2);
               break;
               case "/": divide(x1,y1,x2,y2);
               break;
               case "*": multiply(x1,y1,x2,y2);
               break;
            }
        }
    }
    public static long ggT(long x, long y){
        if (y == 0) return x;
        else
            return ggT(y, x%y);
    }

    public static void add(long x1, long y1, long x2, long y2){
        long zaehler = x1*y2 + x2*y1;
        long nenner = y1*y2;
        fix(zaehler,nenner);
    }
    public static void subtract(long x1, long y1, long x2, long y2){
        long zaehler = x1*y2 - x2*y1;
        long nenner = y1*y2;
        fix(zaehler,nenner);
    }
    public static void divide(long x1, long y1, long x2, long y2){
        long zaehler = x1*y2;
        long nenner = y1*x2;
        fix(zaehler,nenner);
    }
    public static void multiply(long x1, long y1, long x2, long y2){
        long zaehler = x1*x2;
        long nenner = y1*y2;
        fix(zaehler,nenner);
    }
    public static void fix(long zaehler, long nenner){
        long x = zaehler;
        long y = nenner;
        long ggt = ggT(zaehler,nenner);

        x /= ggt;
        y /= ggt;

        if (y < 0 && x > 0){
            x *= -1;
            y *= -1;
        }
        if (y < 0 && x < 0){
            y *= -1;
        }
        print(x,y);
    }
    public static void print(long zaehler, long nenner){
        System.out.println(zaehler + " " + "/" + " " + nenner);
    }
}
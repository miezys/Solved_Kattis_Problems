/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/names
*/

import java.util.Scanner;

public class PalindromeNames {
    static String s;
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int res = 1000; // maximum cost
        s = reader.nextLine();

        for(int i=0; i<=s.length(); ++i){
            if(i>=res) break;
            res = Math.min(res, i+nrDiff(i, s.length()-1));
        }
        System.out.println(res);
    }

    public static int nrDiff(int l, int r){
        int res = 0;
        for(int i=l, j=r; j>i; ++i, --j){
            if(s.charAt(i) != s.charAt(j)) ++res;
        }
        return res;
    }
}

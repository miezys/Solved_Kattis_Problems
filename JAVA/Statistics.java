/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/statistics
*/

import java.util.*;

public class Statistics {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


        List<Integer> ints = new ArrayList<>();
        int testcase = 1;
        while(reader.hasNext()){
           int n = reader.nextInt();
            {
                for(int j=0; j<n; j++){
                    int input = reader.nextInt();
                    ints.add(input);
                }
            }
            int min = Collections.min(ints);
            int max = Collections.max(ints);
            System.out.println("Case " + testcase + ": " + min + " " + max + " " + (max - min));
            ints.clear();
            testcase++;
        }

    }
}
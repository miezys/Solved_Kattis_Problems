/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/acm
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ACMContestScoring {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


        List<ACMContestSet> set = new ArrayList<>();
        List<ACMContestSet> rightAnswSet = new ArrayList<>();
        int minutes =0, rightansw = 0;

        while(reader.hasNext()){
            String input = reader.nextLine();
            String[] data = input.split(" ");

            int mins = Integer.parseInt(data[0]);

            if (mins == -1) break;

            String prob = data[1];
            String res = data[2];

            ACMContestSet a = new ACMContestSet(mins,prob,res);


            if(res.equals("right")){
                minutes += a.getTime();
                rightansw++;
                rightAnswSet.add(a);
            }else{
                set.add(a);
            }

        }

        for(ACMContestSet a : rightAnswSet){
            for(ACMContestSet b : set){
                if(a.getProblem().equals(b.getProblem())){
                    minutes += 20;
                }
            }

        }

        System.out.println(rightansw + " " + minutes);
    }
}

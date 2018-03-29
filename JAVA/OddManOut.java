/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/oddmanout
*/

import java.util.*;

public class OddManOut {

    private int integer;
    private String single;

    public OddManOut(int integer, String single) {
        this.integer = integer;
        this.single = single;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for(int i=0; i<n; i++){
            int g = reader.nextInt();
            List<Integer> ints = new ArrayList<>();
            for(int j=0; j<g; j++){
                int input = reader.nextInt();
                if(ints.contains(input)){
                    for(Iterator<Integer> iter = ints.iterator(); iter.hasNext();){
                        Integer a = iter.next();
                        if(a == input){
                            iter.remove();
                        }
                    }
                }
                else{
                    ints.add(input);
                }
            }
            System.out.println("Case #" + (i+1) + ": " + ints.get(0));
        }


    }
}
/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/sortofsorting
*/

import java.util.*;


public class SortOfSorting {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        while(n!=0){
            List<String> words = new ArrayList<>();
            for(int i=0; i<n; i++){
                words.add(reader.nextLine());
            }
           // words.sort(String::compareToIgnoreCase);

            Collections.sort(words, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String substr1 = o1.substring(0,2);
                    String substr2 = o2.substring(0,2);
                    return substr1.compareTo(substr2);
                }
            });

            for(int i=0; i<words.size(); i++){
                System.out.println(words.get(i));
            }
            System.out.println();
            n = Integer.parseInt(reader.nextLine());
            words.clear();
        }
    }
}
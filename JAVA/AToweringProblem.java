/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/towering
*/

import java.util.*;

public class Towering {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] boxes = new int[6];

        for (int i=0; i<6; i++){
            boxes[i] = reader.nextInt();
        }
        int a = reader.nextInt();
        int b = reader.nextInt();
        Arrays.sort(boxes);

        outterloop:
        for (int i=0; i<6; i++){
            for (int j=1; j<6; j++){
                for (int k=2; k<6; k++){
                    if(boxes[i]+boxes[j]+boxes[k] == a && isOk(boxes, boxes[i], boxes[j] , boxes[k], b)){
                        System.out.print(boxes[k] + " " + boxes[j] + " " + boxes[i] + " ");
                        for (int l=5; l>=0; l--){
                            if(boxes[l] != boxes[i] && boxes[l] != boxes[j] && boxes[l] != boxes[k]){
                                System.out.print(boxes[l] + " ");
                            }
                        }
                        break outterloop;
                    }
                }
            }
        }
    }

    public static boolean isOk(int[] boxes, int x, int y, int z, int b){
        boolean result = false;
        int[] copyBoxes = new int[6];
        System.arraycopy(boxes, 0, copyBoxes, 0, boxes.length);
        for (int i=0; i<6; i++){
            if(copyBoxes[i] == x || copyBoxes[i] == y || copyBoxes[i] == z){
                copyBoxes[i] = 0;
            }
        }
        outterloop:
        for (int i=0; i<6; i++){
            for (int j=1; j<6; j++){
                for (int k=2; k<6; k++){
                    if(copyBoxes[i]!=0 && copyBoxes[j]!=0 && copyBoxes[k]!=0 && (copyBoxes[i] + copyBoxes[j] + copyBoxes[k] == b)){
                        result = true;
                        break outterloop;
                    }
                }
            }
        } return result;
    }
}
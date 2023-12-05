package ProgectJavaBasics;

public class T3 {
    public static void main(String[] args) {
        int [][] arr={
                {65,23,16,4,55,64,3},
                {52,-21,-34,5,21,8},
                {32,7,8,-67,1,-48,23,12,57}
        };
        for (int[] i : arr) {
            for (int j : i) {
                if (j%2==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

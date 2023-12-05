package ProgectJavaBasics;

public class T4 {
    public static void main(String[] args) {
        int [][] arr={
                {65,23,16,4,55,64,3},
                {52,-21,-34,5,21,8},
                {32,7,8,-67,1,-48,23,12,57}
        };
        int sumOdd=0;
        int sumEven=0;

        for (int[] i : arr) {
            for (int j : i) {
                if (j%2==0){
                    sumEven+=j;
                } else {
                    sumOdd+=j;
                }
            }
        }
        System.out.println("Sum of even is "+sumEven);
        System.out.println("Sum of Odd is "+sumOdd);
    }
}

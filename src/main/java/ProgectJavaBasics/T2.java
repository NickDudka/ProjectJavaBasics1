package ProgectJavaBasics;

public class T2 {
    public static void main(String[] args) {
        int [] arr={73,45,12,5,65,-35};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of all stored elements in that array is "+sum);
    }
}

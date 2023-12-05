package ProgectJavaBasics;

public class T7 {
    public static void main(String[] args) {
        int a=0;
        int n=10;
        int b=a+1;
        int sum=0;

        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }

    }
}

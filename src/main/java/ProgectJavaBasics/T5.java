package ProgectJavaBasics;

public class T5 {
    public static void main(String[] args) {
        int num1=64;
        int num2=31;
        System.out.println("Before swapping Num1="+num1+" and Num2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping Num1="+num1+" and Num2="+num2);
    }
}

package ProgectJavaBasics;

import java.util.Arrays;

public class T9 {
    public static void main(String[] args) {
        int[] arr = {45, 6, 1, 81, -23, -5, -25, 95, 13, 93, 57};
        int max = arr[0];
        int maxSecond = arr[0];

        System.out.println("Array is:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSecond && arr[i] != max) {
                maxSecond = arr[i];
            }
        }

        System.out.println("Second largest number in the array is " + maxSecond);
    }
}

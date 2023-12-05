package ProgectJavaBasics;

import java.util.Arrays;

public class T8 {
    public static void main(String[] args) {
        int [] arr={45,6,1,0,-23,-5,-25,95,13,45,57};
        int min=arr[1],max=arr[1];
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i<min) {
                min=i;
            }
        }
        System.out.println("Array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum number in the array is "+min);
        System.out.println("Maximum number in the array is "+max);
    }
}

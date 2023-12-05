package ProgectJavaBasics;

public class T10 {
    public static void main(String[] args) {
        String[] arr= {"car", "strawberry", "orange", "bmw", "pear", "bmw", "melon", "table", "car", "table", "apple"};
        System.out.print("Duplicate items : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i]+", ");
                    break;
                }

            }
        }
    }
}

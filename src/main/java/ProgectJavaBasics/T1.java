package ProgectJavaBasics;

public class T1 {
    public static void main(String[] args) {
        double [] temperature={70,71,60,54,49,51,58};
        double lowTemp=temperature[0];
        double highTemp=temperature[0];
        for (int i = 0; i < temperature.length; i++) {
            if (highTemp<temperature[i]){
                highTemp=temperature[i];
            }
            if (lowTemp>temperature[i]){
                lowTemp=temperature[i];
            }
        }
        System.out.println("The highest temperature is: "+highTemp+"°F");
        System.out.println("The lowes temperature is: "+lowTemp+"°F");

    }
}

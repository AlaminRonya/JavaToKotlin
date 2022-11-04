package java_code;

import java.util.Arrays;

public class Root {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'c';
        Byte bt = 5;
        Short s = 15;
        int i = 12;
        long l = 12;
        float f = 14.5f;
        double d = 45.5;
        String str = "Name";
        int[] arr = new int[5];
        Arrays.stream(arr).forEach(System.out::println);
        if (bt instanceof Byte){
            System.out.println("It is a byte instance.");
        }
    }

}

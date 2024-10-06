package Separator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("even " + Arrays.toString(separator.even()));
        System.out.println("odd " + Arrays.toString(separator.odd()));
    }
}

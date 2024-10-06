package Separator;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    int[] even() {
        int k = 0; int n = 0;
        for (int i : array)
            if (i % 2 == 0)
                k++;

        int[] evens = new int[k];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens[n] = array[i];
                n += 1;
            }
        }
        return evens;
    }

    int[] odd() {
        int k = 0; int n = 0;
        for (int i : array)
            if (i % 2 != 0)
                k++;

        int[] odds = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[n] = array[i];
                n += 1;
            }
        }
        return odds;
    }
}

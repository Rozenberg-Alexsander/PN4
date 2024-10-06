package Squirrel;

public class Squirrel {
    private final int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    /*int getNuts(int n) {
        return nuts[n];
    }*/

    int maxNuts() {
        if (nuts.length > 1) {
            int[] arr = nuts.clone();
            arr[1] = max(arr[1], arr[0] + arr[1]);

            if (arr[1] < 0)
                arr[1] = 0;

            for (int i = 2; i < arr.length; i++) {
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
                if (arr[i] < 0)
                    arr[i] = 0;
            }

            int a = max(arr[arr.length - 2], arr[arr.length - 1]);
            return max(0, a);
        }
        else
            return max(0, nuts[0]);
    }

    private int max(int a, int b) {
        return Math.max(a, b);

    }
}

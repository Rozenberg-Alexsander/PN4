package Mass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        System.out.println(Arrays.deepToString(a.resize()));

        ToLine s = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] arr1 = s.resize();
        System.out.println(Arrays.toString(s.resize()));
    }
}

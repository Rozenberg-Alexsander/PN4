package Mass;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int[] arr = new int[data.length * data[0].length];

        int start = 0;

        for (int[] datum : data) {
            for (int i = 0; i < datum.length; i++) {
                arr[start + i] = datum[i];
            }
            start += datum.length;
        }
        return arr;
    }
}

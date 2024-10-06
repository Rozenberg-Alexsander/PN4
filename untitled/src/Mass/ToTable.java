package Mass;

public class ToTable {
    private int[] data;
    private int x;
    private int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        int[][] arr = new int[x][y];
        int count = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (data.length > count){
                    arr[i][j] = data[count++];
                }
            }
        }
        return arr;
    }
}

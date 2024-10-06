package Rectangle;

public class Rectangle {
    private int[][] points;

    public Rectangle(int[][] points) {
        this.points = points;
    }

    int min(int ind) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] <= min)
                min = points[i][ind];
        }
        return min;
    }

    int max(int ind) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] >= max)
                max = points[i][ind];
        }
        return max;
    }

    int getWight() {
        return this.max(0) - this.min(0);
    }

    int getHeight() {
        return this.max(1) - this.min(1);
    }

    String getBorders() {
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }
}

package Balance;

public class Balance {
    private int r;
    private int l;

    public void addRight(int n) {
        r += n;
    }

    public void addLeft(int n) {
        l += n;
    }

    String getSituation() {
        if (r == l)
            return  "=";
        else if (r > l)
            return  "R";
        else
            return  "L";
    }
}

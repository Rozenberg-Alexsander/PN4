package Balance;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addRight(50);
        balance.addLeft(5);
        System.out.println(balance.getSituation());
    }
}
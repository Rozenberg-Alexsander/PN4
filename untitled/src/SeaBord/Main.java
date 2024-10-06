package SeaBord;

public class Main {
    public static void main(String[] args) {
        SeaBoard seaBord = new SeaBoard();
        seaBord.shoot(0, 0, "m");
        seaBord.shoot(2, 0, "h");
        seaBord.shoot(6, 9, "h");
        seaBord.shoot(2, 1, "d");
        for (int i = 0; i < seaBord.getField().length; i++) {
            for (int j = 0; j < seaBord.getField().length; j++) {
                System.out.print(seaBord.getField()[i][j]);
            }
            System.out.println();
        }
    }
}

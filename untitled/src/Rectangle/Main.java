package Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new int[][]{{-1, -2}, {3, 4}});
        System.out.println(rectangle.getWight() + " " + rectangle.getHeight());
        System.out.println(rectangle.getBorders());
    }
}
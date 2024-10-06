package Mage;

public class Main {
    public static void main(String[] args) {
        Mage fire = new Mage("FACKel", 10, 100, "Fire");
        Mage ice = new Mage("BigIce", 10, 100, "Ice");
        Mage earth = new Mage("Stone", 10, 100, "Earth");

        /*System.out.println(fire.fight(ice));
        System.out.println(ice.fight(earth));
        System.out.println(earth.fight(fire));*/
        System.out.println(fire.fight(fire));
    }
}

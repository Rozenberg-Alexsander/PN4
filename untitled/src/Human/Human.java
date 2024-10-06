package Human;

public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 105;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.age = 33;
        this.weight = 105;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.weight = 105;
    }

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
        this.name = "Alex";
    }
}

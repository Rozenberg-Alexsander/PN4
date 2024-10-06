package Programmer;

public class Programmer {
    private String name;
    private String company;
    private String position;


    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "Middle";
    }

    String getPosition() {
        return position;
    }

    void work() {
        switch (position) {
            case "Intern":
                position = "Junior";
                break;

            case "Junior":
                position = "Middle";
                break;

            case "Middle":
                position = "Senior";
                break;

            case "Senior":
                position = "Lead";
                break;
        }
    }
}

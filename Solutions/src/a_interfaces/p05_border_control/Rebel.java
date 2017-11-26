package a_interfaces.p05_border_control;

public class Rebel implements Buyer{
    private String name;
    private int age;
    private String group;
    public static int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public static int getFood() {
        return food;
    }

    @Override
    public void buyFood() {
        this.food+=5;
    }
}

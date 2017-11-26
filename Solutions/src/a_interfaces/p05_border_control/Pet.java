package a_interfaces.p05_border_control;

public class Pet extends BasicLivingThing implements Celabrate {
    private String name;
    private String birthday;
    private int age;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}

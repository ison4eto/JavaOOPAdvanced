package a_interfaces.p05_border_control;

public class Citizen extends BasicLivingThing implements Celabrate,Buyer{
    private String name;
    private String birthday;
    private int age;
    public static int food = 0;

     Citizen(String name, int age,String id) {
        this.name = name;
        this.age = age;
        super.setId(id);
    }

    public Citizen(String name, int age, String id,String bithday) {
        this.name = name;
        this.birthday = birthday;
        super.setId(id);
        this.age = age;
    }

    public static int getFood() {
        return food;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public void buyFood() {
        this.food +=10;
    }
}

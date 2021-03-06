package a_interfaces.p01_person;

class Citizen implements Person,Identifiable,Birthable {
    private String name;
    private int age;
    private String id;
    private String birthday;


    Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public String getId() {
        return this.id;
    }
}

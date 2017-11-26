package a_interfaces.p05_border_control;

public abstract class BasicLivingThing implements LivingThing{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}

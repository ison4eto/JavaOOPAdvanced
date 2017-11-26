package a_interfaces.p05_border_control;

public class Robot extends BasicLivingThing {
    private String model;

    public Robot(String model, String id) {
        this.model = model;
        super.setId(id);
    }

    @Override
    public String getId() {
        return super.getId();
    }
}

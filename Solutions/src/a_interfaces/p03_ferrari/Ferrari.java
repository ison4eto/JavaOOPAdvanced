package a_interfaces.p03_ferrari;

public class Ferrari implements Car {
    private final String MODEL = "488-Spider";
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String  pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String pushBrakes() {
        return "Brakes!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.MODEL,this.pushBrakes(),this.pushGas(),this.driver);
    }
}

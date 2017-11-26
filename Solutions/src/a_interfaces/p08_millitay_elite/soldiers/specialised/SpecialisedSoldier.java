package a_interfaces.p08_millitay_elite.soldiers.specialised;

public abstract class SpecialisedSoldier {
    private String corps;

    public void setCorps(String corps) {
        if(corps.equals("Airforces") || corps.equals("Marines")){
            this.corps = corps;
        }else{
            throw new IllegalArgumentException("Invalid corps!");
        }
    }
}

package a_interfaces.p08_millitay_elite.soldiers.specialised;

public class Mission {
    private String codeName;
    private String state;

    public void setState(String state) {
        if(state.equals("inProgress") || state.equals("Finished")){
            this.state = state;
        }else{
            throw new IllegalArgumentException("Invalid state!");
        }
    }
    public void CompleteMission(){

    }
}

package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;

import java.util.List;

public class OneVsOne implements Action {

    private static final String ERROR = "There should be exactly 2 participants for OneVsOne!";
    private List<Targetable> participants;

    public String executeAction(List<Targetable> participants) {
        this.participants = participants;
        if(participants.size()!=2){
            return ERROR;
        }
        StringBuilder sb = new StringBuilder();

        Targetable firstHero = participants.get(0);
        Targetable secondHero = participants.get(1);

        while (firstHero.isAlive()){
            sb.append(firstHero.attack(secondHero)).append(System.lineSeparator());
            if (secondHero.isAlive()) {
                sb.append(secondHero.attack(firstHero)).append(System.lineSeparator());
            }else {
                break;
            }
        }

        if (firstHero.isAlive()){
            sb.append(String.format("%s is victorious!%s%s", firstHero.getName(), System.lineSeparator(),firstHero.toString()));
            secondHero.giveReward(firstHero);
        }else {
            sb.append(String.format("%s is victorious!%s%s", firstHero.getName(), System.lineSeparator(),firstHero.toString()));
            firstHero.giveReward(secondHero);
        }
        return sb.toString();
    }
}

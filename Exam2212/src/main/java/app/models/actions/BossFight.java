package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;

import java.util.List;

public class BossFight implements Action {

    private static final String ERROR = "There should be at least 1 participant for boss fight!";
    private Targetable boss;

    @Override
    public String executeAction(List<Targetable> participants) {
        if (participants.isEmpty()) {
            return ERROR;
        }
        whileloop:
        while (!boss.isAlive()) {
            for (Targetable attacker : participants
                    ) {

                if (attacker.getDamage() > boss.getHealth()) {
                    break whileloop;
                }
                attacker.attack(boss);
                if (boss.getDamage() > attacker.getHealth()) {
                    attacker.giveReward(boss);
                    participants.remove(attacker);
                }
                boss.attack(attacker);
            }
            if (participants.isEmpty()) {
                return "Boss has slain them all!";
            }
        }

        StringBuilder sb = new StringBuilder("");
        sb.append(boss.getName()).append(" has been slain by:").append(System.lineSeparator());
        participants.forEach(b -> sb.append(b).append(System.lineSeparator()));
        return sb.toString();
    }
}

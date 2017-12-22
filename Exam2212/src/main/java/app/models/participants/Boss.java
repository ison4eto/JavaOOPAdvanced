package app.models.participants;

import app.contracts.Targetable;

import static app.models.Config.BOSS_DAMAGE;
import static app.models.Config.BOSS_GOLD;
import static app.models.Config.BOSS_HEALTH;

public class Boss implements Targetable {
    private String name;
    private double health;
    private double damage;
    private double gold;
    private boolean isAlive;

    public Boss(String name) {
        this.setName(name);
        this.setHealth(BOSS_HEALTH);
        this.damage = BOSS_DAMAGE;
        this.gold = BOSS_GOLD;
        this.isAlive = true;
    }

    //TODO:Don't print that the boss attacks Correct the duplicate
    @Override
    public String attack(Targetable target) {
        if (!this.isAlive) {
            return this.getName() + " is dead! Cannot attack.";
        }
        if (!target.isAlive()) {
            return target.getName() + " is dead! Cannot be attacked.";
        }
        target.takeDamage(this.getDamage());
        return "";
    }

    @Override
    public void takeDamage(double damage) {
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getDamage() {
        return this.damage;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getGold() {
        return this.gold;
    }

    @Override
    public void setHealth(double health) {
        if (this.getHealth() <= 0) {
            this.health = 0;
            this.isAlive = false;
        } else {
            this.health = health;
        }

    }

    //TODO:rewards Is the reward all gold from the hero?
    @Override
    public void giveReward(Targetable targetable) {
        targetable.receiveReward(this.gold);
        this.gold = 0;
    }

    @Override
    public void receiveReward(double reward) {
        this.gold = this.getGold()+reward*0.1;
    }

    @Override
    public void levelUp() {
        this.setHealth(BOSS_HEALTH);
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}

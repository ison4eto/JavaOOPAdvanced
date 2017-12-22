package app.models.participants;

import app.contracts.Hero;
import app.contracts.Targetable;
import app.models.Config;

import static app.models.Config.*;

public abstract class BaseHero implements Hero {

    private int level;
    private boolean isAlive;
    private double gold;
    private int strength;
    private int dexterity;
    private int intelligence;
    private double health;
    private String name;

    BaseHero(String name) {
        this.setName(name);
        this.gold = HERO_START_GOLD;
        this.level = 1;
        this.isAlive = true;
    }

    //TODO: Does it work?
    @Override
    public String attack(Targetable target) {
        if (!this.isAlive()) {
            return this.getName() + " is dead! Cannot attack.";
        }

        if (!target.isAlive()){
            return target.getName() + " is dead! Cannot be attacked.";
        }

        target.takeDamage(this.getDamage());

        String result = this.getName() + " attacked!";
        if (!target.isAlive()) {
            this.levelUp();
            target.giveReward(this);
            result += String.format(" %s has been slain by %s.", target.getName(), this.getName());
        }
        return result;
    }

    @Override
    public void receiveReward(double reward){
        this.gold = this.getGold()+reward;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
        this.setHealth(strength * HERO_HEALTH_MULTIPLIER);
    }
    @Override
    public void takeDamage(double damage) {
        this.setHealth(this.getHealth()-damage);
    }

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public void giveReward(Targetable targetable) {
        targetable.receiveReward(this.gold);
        this.gold = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getGold() {
        return this.gold;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void levelUp() {
        this.setStrength(this.getStrength() * HERO_HEALTH_MULTIPLIER);
        this.setDexterity(this.getDexterity() * HERO_HEALTH_MULTIPLIER);
        this.setIntelligence(this.getIntelligence() * HERO_HEALTH_MULTIPLIER);
        this.level += 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb//.append(String.format("  Name: %s | Class: %s", this.getName(), this.getClass().getSimpleName()))
                .append(System.lineSeparator())
                .append(String.format("  Health: %.2f | Damage: %.2f", this.getHealth(), this.getDamage()))
                .append(System.lineSeparator())
                .append(String.format("  %d STR | %d DEX | %d INT | %.2f Gold", this.getStrength(), this.getDexterity(), this.getIntelligence(), this.gold));

        return sb.toString();
    }
}

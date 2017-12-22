package app.models.participants;

import app.models.Config;

public class Warrior extends BaseHero {

    public Warrior(String name){
        super(name);
        super.setStrength(Config.WARRIOR_BASE_STRENGTH);
        super.setDexterity(Config.WARRIOR_BASE_DEXTERITY);
        super.setIntelligence(Config.WARRIOR_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return (super.getStrength()*2)+super.getDexterity();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("  Name: %s | Class: %s", this.getName(), this.getClass().getSimpleName()))
                .append(super.toString());
        return sb.toString();
    }



}

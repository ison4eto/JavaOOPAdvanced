package app.models.participants;

import app.models.Config;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class Necromancer extends BaseHero {

    public Necromancer(String name){
        super(name);
        super.setStrength(Config.NECROMANCER_BASE_STRENGTH);
        super.setDexterity(Config.NECROMANCER_BASE_DEXTERITY);
        super.setIntelligence(Config.NECROMANCER_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return (super.getIntelligence()+super.getDexterity()+ super.getStrength())*2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("  Name: %s | Class: %s", this.getName(), this.getClass().getSimpleName()))
                .append(super.toString());
        return sb.toString();
    }

}

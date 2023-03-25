package kg.geeks.game.players;

import kg.geeks.game.players.Boss;
import kg.geeks.game.players.Hero;
import kg.geeks.game.players.SuperAbility;

public class Golem extends Hero {
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.HERO_DEFENCE, "Golem");
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        
    }
}

package nl.timo;

import java.util.Random;

public class Pokemon {
//    public string Name {get; set;}
    private String name;
    private Integer hp;
    private Integer strength;

    public Pokemon(String name, Integer hp, Integer strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public String attack(Pokemon target, Die die) {
        Integer roll = die.roll();
        Integer hitChance = roll + this.strength;
        Integer armorClass = target.strength * 3;

        if (hitChance > armorClass) {
            return "Hit!" + appendAttackResultInformation(roll, hitChance, armorClass);
        }

        return "Miss!" + appendAttackResultInformation(roll, hitChance, armorClass);
    }

    private String appendAttackResultInformation(Integer roll, Integer hitChance, Integer amorClass) {
        return String.format(" %s (roll) + %s (str) = %s hit vs %s (ac)", roll, strength, hitChance, amorClass);
    }

    public String getName() {
        return name;
    }
}

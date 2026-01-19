package module4_advanced_oop.lesson3_access_modifiers.game.characters;

public class Warrior extends Character{
    private int strength;

    public Warrior(String name, int level, int strength) {
        super(name, level);
        this.strength = strength;
    }

    public void train(){
        strength++;
        levelUp();
    }
}

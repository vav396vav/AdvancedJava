package module4_advanced_oop.lesson3_access_modifiers.game.characters;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int level, int mana) {
        super(name, level);
        this.mana = mana;
    }

    @Override
    public void displayInfo() {
        System.out.println("mane:" + mana);
    }

}

package module4_advanced_oop.lesson3_access_modifiers.game.characters.game.engine;

import module4_advanced_oop.lesson3_access_modifiers.game.characters.Mage;
import module4_advanced_oop.lesson3_access_modifiers.game.characters.Warrior;

public class GameEngine {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("John",4,10);
        Mage mage = new Mage("Mary",3,5);

        warrior.displayInfo();
        mage.displayInfo();
    }
}

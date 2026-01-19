package module4_advanced_oop.lesson3_access_modifiers.game.characters;

public class Character {
    protected String name;
    protected int level;
    private long id;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.id = System.nanoTime();
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", level: " + level);
    }

    protected void levelUp(){
        level++;
    }

    private void logAction(String action){
        System.out.println("LOG: " + action);
    }
}

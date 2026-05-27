package task7.arena.heroes;

public class Mage extends Hero{
    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana = mana;
    }

    @Override
    public void attack(){
        System.out.println(name + " запускает огненный шар!");
        System.out.println();
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

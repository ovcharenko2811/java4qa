package task7.arena.heroes;

public class Knight extends Hero{
    private String armor;

    public Knight(String name, int level, int health, String armor) {
        super(name, level, health);
        this.armor = armor;
    }

    @Override
    public void attack(){
        System.out.println(name + " бьёт мечом!");
        System.out.println();
    }

    @Override
    public String toString(){
        return "Knight{name='" + name + "', level=" + level + ", health=" + health + ", armor=" + armor + "} \n";
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

//    Неудачное переопределение final-метода
//    @Override
//    public final void rest(){
//        System.out.println("Рыцарь на чиле");
//    }
}

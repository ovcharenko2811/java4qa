package task7.arena.heroes;

public class Hero {
    String name;
    int level;
    int health;
    public static final int MAX_LEVEL = 100;
    static int heroesCreated;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        heroesCreated++;
    }

    public void printInfo() {
        //- должен выводить в консоль имя героя, уровень и текущее здоровье в произвольном формате
        System.out.println("Имя героя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("ХП: " + health);
        System.out.println();
    }
    public void takeDamage(int damage){
        //- уменьшает здоровье героя на переданное значение. если здоровье стало меньше 0, оно должно быть = 0.
        health -= damage;
        if(health < 0) health = 0;
    }

    public void levelUp() {
        //- увеличивает уровень на 1, но не позволяет превысить максимальный уровень.
        if(level < MAX_LEVEL) level ++;
    }

    public void attack(){
        System.out.println("Герой наносит обычный удар.");
        System.out.println();
    }

    public void attack(String target){
        System.out.println("Герой наносит обычный удар. Цель: " + target);
        System.out.println();
    }

    public void attack(String target, int times){
        System.out.println("Герой атакует цель " + target + " " + times + " раза.");
        System.out.println();
    }

    public static void printHeroesCreated(){
        System.out.println("Всего создано героев: " + heroesCreated);
        System.out.println();
    }

    public final void rest(){
        System.out.println("Герой отдыхает и восстанавливает силы.");
        System.out.println();
    }

}

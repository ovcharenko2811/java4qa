package task7.arena.app;

import task7.arena.heroes.Archer;
import task7.arena.heroes.Hero;
import task7.arena.heroes.Knight;
import task7.arena.heroes.Mage;

public class App {
    static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Арагорн", 10, 100, "Двуручный меч"),
                new Archer("Леголас", 12, 80, 999),
                new Mage("Гендальф",  100, 40, 100)
        };

        for(Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
        }

        final Knight knight = new Knight("рыцарьprololqx", 18, 99, "Кастет");
        System.out.println(knight);
        knight.setArmor("Пистолет");
        System.out.println(knight);

        Hero.printHeroesCreated();
    }
}

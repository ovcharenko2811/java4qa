package task3;

import java.util.Arrays;

public class Task3Baskets {
    public static void main(String[] args) {
        String[] Petya = {"курица", "бананы", "творог"};
        String[] Kolya = {"курица", "бананы", "творог"};
        String[] Terentiy = {"пиво", "пельмени", "ласка магия черного"};


        //1. Сравните между собой корзины по количеству товаров:
        //
        //1) Пети и Коли

        if (Petya.length > Kolya.length) {
            System.out.println("У Пети больше \uD83D\uDE1C");
        }
        else if (Kolya.length > Petya.length){
            System.out.println("У Коли больше \uD83D\uDE1C");
        }
        else {
            System.out.println("У Пети и Коли одинаковое количество товаров в корзине");
        }

        //2) Пети и Терентия
        if (Petya.length > Terentiy.length) {
            System.out.println("У Пети больше \uD83D\uDE1C");
        }
        else if (Terentiy.length > Petya.length){
            System.out.println("У Терентия больше \uD83D\uDE1C");
        }
        else {
            System.out.println("У Пети и Терентия одинаковое количество товаров в корзине");
        }


        //2. Сравните между собой корзины по их составу:
        //
        //1) Пети и Коли
        if (Arrays.equals(Petya, Kolya)) System.out.println("У Пети и Коли одинаковые по составу корзины");
        else  System.out.println("У Пети и Коли разные по составу корзины");
        //2) Пети и Терентия
        if (Arrays.equals(Petya, Terentiy)) System.out.println("У Пети и Терентия одинаковые по составу корзины");
        else  System.out.println("У Пети и Терентия разные по составу корзины");


        //3. Проведите ценное исследование - привлекают ли пользователей товары с более длинными названиями?
        //объявляем общий массив всех продуктов
        String[] allProducts = new String[Petya.length + Kolya.length + Terentiy.length];
        int index = 0;
        //объединяем массивы в один
        System.arraycopy(Petya, 0, allProducts, index, Petya.length);
        index += Petya.length;

        System.arraycopy(Kolya, 0, allProducts, index, Kolya.length);
        index += Kolya.length;

        System.arraycopy(Terentiy, 0, allProducts, index, Terentiy.length);
        //считаем самое длинное и короткое названия продуктов
        String longest = allProducts[0];
        String shortest = allProducts[0];
        int sum = 0;

        for (String product : allProducts) {
            if (product.length() > longest.length()) {
                longest = product;
            }
            if (product.length() < shortest.length()) {
                shortest = product;
            }
            sum += product.length();
        }

        //1) продукт с самым длинным названием
        System.out.println("Самое длинное название: " + longest);

        //2) продукт с самым коротким названием
        System.out.println("Самое короткое название: " + shortest);

        //3) средняя длина названия товара среди всех представленных товаров
        int average = sum / allProducts.length;
        System.out.println("Средняя длина названия: " + average);

    }
}

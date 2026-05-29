package task2;

import java.text.DecimalFormat;
import java.util.Random;

public class Task2BusinessCoach {
    public static void main(String[] args) {
        Random random = new Random(); // создаем экземпляр класса Random, чтобы использовать в статичном методе
        int age = random.nextInt(100); // генерим возраст до 100
        double accountBalance = random.nextDouble(1000000); // генерим баланс на счете до ляма, потом обрежем до сотых
        boolean hasInvitation  = true; // есть ли у посетителя приглашение, хардкодим согласно постановке задачи
        boolean isBanned = false; // находится ли посетитель в черном списке, хардкодим согласно постановке задачи

        boolean isAdult; // есть ли 18 лет
        boolean isInvitedOrRich; // есть приглашение или достаточная сумма на счете
        boolean isAllowedToAttend; // итоговое решение, проходит пользователь или нет
        double mandatoryFee; // обязательный добровольный взнос

        isAdult = age >= 18;
        isInvitedOrRich = hasInvitation || accountBalance > 50000;
        isAllowedToAttend = isAdult && isInvitedOrRich && !isBanned;

        DecimalFormat df = new DecimalFormat("0.00"); // форматирование до 2 знаков после запятой

        System.out.println("Возраст: " + age + ", Баланс счета: " + df.format(accountBalance) + " рублей"); // в постановке вывод не требуется, просто для наглядности
        System.out.println("Пользователь проходит: " + isAllowedToAttend);
        // Считаем взнос только для тех, кто проходит
        if (isAllowedToAttend) {
            mandatoryFee = accountBalance * 7.5 / 100;
            System.out.println("Обязательный добровольный взнос: " + df.format(mandatoryFee) + " рублей");
        }
    }
}
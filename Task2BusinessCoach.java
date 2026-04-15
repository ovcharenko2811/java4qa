import java.text.DecimalFormat;
import java.util.Random;

public class Task2BusinessCoach {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100);
        double accountBalance = random.nextDouble(1000000);
        boolean hasInvitation  = true;
        boolean isBanned = false;

        boolean isAdult;
        boolean isInvitedAndRich;
        boolean isAllowedToAttend;
        double mandatoryFee;

        isAdult = age >= 18;
        isInvitedAndRich = hasInvitation == true && accountBalance > 50000;
        isAllowedToAttend = isAdult == true && isInvitedAndRich == true && isBanned == false;

        // Форматирование до 2 знаков после запятой
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Пользователь проходит: " + isAllowedToAttend);
        mandatoryFee = accountBalance * 7.5 / 100;
        System.out.println("обязательный добровольный взнос: " + df.format(mandatoryFee) + " рублей");
    }
}
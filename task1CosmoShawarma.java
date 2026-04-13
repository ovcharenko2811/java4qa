public class task1CosmoShawarma {
    public static void main(String[] args) {
    String employeeName = "Глеб";
    String dolzhnost = "Старший шаурма-инженер";
    int stavka = 16000;
    int smenaCount = 20;
    int premiya = 3000;
    int fine = 500;
    int price = 300;
    int soldShawarmaCount = 6000;
    int totalSalary = stavka * smenaCount - fine + premiya;

        System.out.println("Сотрудник: "+ employeeName);
        System.out.println("Должность: "+ dolzhnost);
        System.out.println("Оплата за смены: "+ stavka * smenaCount);
        System.out.println("Премия: "+ premiya);
        System.out.println("Штраф: "+ fine);
        System.out.println("Итоговая зарплата: "+ totalSalary);
        System.out.println("Шаур-выручка: "+ price * soldShawarmaCount);

    }
}

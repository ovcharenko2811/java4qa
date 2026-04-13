public class Task1CosmoShawarma {
    public static void main(String[] args) {
    String employeeName = "Глеб";
    String dolzhnost = "Старший шаурма-инженер";
    int stavka = 16000; // ставка за одну смену (руб.)
    int smenaCount = 20; // количество смен
    int premiya = 3000; // премия (руб.)
    int fine = 500; // штраф (руб.)
    int price = 300; // цена одной шаурмы (руб.)
    int soldShawarmaCount = 6000; // количество проданных штук
    int salaryWithoutBonus = stavka * smenaCount; // зарплата без премии
    int totalSalary = salaryWithoutBonus - fine + premiya; // зарплата с премией и штрафом
    int earnings = price * soldShawarmaCount;    // выручка

        System.out.println("Сотрудник: "+ employeeName);
        System.out.println("Должность: "+ dolzhnost);
        System.out.println("Оплата за смены: "+ salaryWithoutBonus);
        System.out.println("Премия: "+ premiya);
        System.out.println("Штраф: "+ fine);
        System.out.println("Итоговая зарплата: "+ totalSalary);
        System.out.println("Шаур-выручка: "+ earnings);

    }
}

import java.util.Scanner;

public class Task4Cycles {
    static void main(String[] args) {
        // Объявляем все нужные переменные
        String testStatus;
        int countPass = 0;
        int countFlaky = 0;
        int countBug = 0;
        int countCritical = 0;
        int countAll = 0;

        // Доп. задание "Шумоподавление"
        System.out.println("Скрыть успешные тесты? Введите: true/false"); // Исключения некорректного ввода пользователем не обрабатываются, т.к. еще не проходили
        Scanner sc = new Scanner(System.in);
        boolean showOnlyIssues = sc.nextBoolean();

        // Доп. задание "Стоп-сигнал"
        System.out.println("Остановить после 3 критических багов? Введите: true/false"); // Исключения некорректного ввода пользователем не обрабатываются, т.к. еще не проходили
        boolean stopSignal = sc.nextBoolean();

        // Проверяем каждый номер - тест
        for(int testNumber =1; testNumber<=100; testNumber++){
            if(testNumber % 3 == 0 && testNumber % 5 == 0){
                testStatus = "Critical!";
                countCritical++;
                countAll++;
            }
            else if(testNumber % 5 == 0){
                testStatus = "Bug";
                countBug++;
                countAll++;
            }
            else if(testNumber % 3 == 0){
                testStatus = "Flaky";
                countFlaky++;
                countAll++;
            }
            else {
                testStatus = "Pass";
                countPass++;
                countAll++;
            }

            // Продолжение доп. задания "Шумоподавления" - проверяем, отображать ли успешные тесты
            if(showOnlyIssues == false) {
                System.out.println("Тест #" + testNumber + ": " + testStatus);
            }
            else if(showOnlyIssues == true){
                if(!testStatus.equals("Pass")){
                System.out.println("Тест #" + testNumber + ": " + testStatus);
                }
            }

            // Продолжение доп. задания "Стоп-сигнал" - проверяем, включен ли стоп-сигнал, передаем break циклу for, и сообщение
            if(stopSignal && countCritical == 3){
                    System.out.println("\uD83D\uDEA8 Слишком много критических багов — будим тимлида!");
                    break;
            }
        }

        //Подводим статистику тестов
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: " + countAll);
        System.out.println("Pass:     " + countPass);
        System.out.println("Flaky:    " + countFlaky);
        System.out.println("Bug:      " + countBug);
        System.out.println("Critical: " + countCritical);
    }
}

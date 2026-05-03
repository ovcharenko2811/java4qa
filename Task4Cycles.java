public class Task4Cycles {
    static void main(String[] args) {
        // Объявляем все нужные переменные
        String testStatus;
        int testNumber;
        int countPass = 0;
        int countFlaky = 0;
        int countBug = 0;
        int countCritical = 0;
        int countAll = 0;

        // Проверяем каждый номер - тест
        for(testNumber =1; testNumber<=100; testNumber++){
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
            System.out.println("Тест #" + testNumber + ": " + testStatus);
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

import java.util.Scanner;

public class Task4Strings {
    static void main(String[] args) {
        //5 вводов пользователя отдельными строками
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        if(string1.equalsIgnoreCase("NULL")){
            System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
            string1 = "XX";
        }
        String string2 = sc.nextLine();
        if(string2.equalsIgnoreCase("NULL")){
            System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
            string2 = "XX";
        }
        String string3 = sc.nextLine();
        if(string3.equalsIgnoreCase("NULL")){
            System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
            string3 = "XX";
        }
        String string4 = sc.nextLine();
        if(string4.equalsIgnoreCase("NULL")){
            System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
            string4 = "XX";
        }
        String string5 = sc.nextLine();
        if(string5.equalsIgnoreCase("NULL")){
            System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
            string5 = "XX";
        }

        //Собираем общее сообщение
        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        sb.append("#");
        sb.append(string2);
        sb.append("#");
        sb.append(string3);
        sb.append("#");
        sb.append(string4);
        sb.append("#");
        sb.append(string5);

        String finalMessage = sb.toString();

        //Выводим итоговое сообщение
        System.out.println("Расшифрованное послание: " + finalMessage);
    }
}

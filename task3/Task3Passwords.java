package task3;

public class Task3Passwords {
    public static void main(String[] args) {
        String[] passwords = {"}|{0IIA CJI0Ha"," 12332145","1qazQAZ!"};
        for (String password : passwords){
            boolean valid = password.length() > 8
                    && !password.startsWith("1")
                    && !password.endsWith("z")
                    && !password.contains("1234")
                    && !password.contains("qwerty");
            System.out.println("пароль '" + password + "' прошел проверку: " + valid);
        }
    }
}

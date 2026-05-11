import java.time.Year;
import java.util.Random;

public class Task5Methods {
    static void main(String[] args) {
        String code = generateAccessCode();
        boolean isValid = isValidCode(code, 8);
        if(isValid) {
            System.out.println("Код прошел валидацию");
        } else {
            System.out.println("Код НЕ прошел валидацию");
        }
        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected",true);
        String agent1 = generateAgentId("AGENT", 42);
        String agent2 = generateAgentId("AGENT", 77);
        String agent3 = generateAgentId("AGENT", 13);
        System.out.println(agent1);
        System.out.println(agent2);
        System.out.println(agent3);
    }

    public static String generateAccessCode(){
        String currentYear = String.valueOf(Year.now().getValue());
        int mathPow = (int) Math.pow(3, 7);
        String finalString = new StringBuilder().append(currentYear).append("-").append(mathPow).toString();
        return finalString;
    }

    private static boolean isValidCode(String code, int minLength){
        if(code != null && code.length() >= minLength && code.contains("-")){
            return true;
        } else return false;
    }

    public static void logEvent(String message){
        System.out.println("[INFO] " + message);
    }

    public static void logEvent(String message, boolean isCritical){
        if(isCritical) {
            System.out.println("[CRITICAL] " + message);
        } else {
            logEvent(message);
        }
    }

    public static String generateAgentId(String prefix, int seed){
        Random random = new Random(seed);
        int randomNum = random.nextInt(1000,10000);
        return prefix + "-" + randomNum;
    }
}

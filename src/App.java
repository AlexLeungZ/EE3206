import java.util.Date;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(message(args));

        double val = 3.85666;
        double roundedVal = Double.valueOf(String.format("%.2f", val));
        System.out.println(roundedVal);

        var curTime = new Date();
        System.out.println(curTime);

        var randInt = new Random(curTime.getTime());
        for (int i = 0; i < 10; i++)
            System.out.print(randInt.nextInt(100) + " ");

    }

    public static String message(String... values) {
        return "Hello, World. " + String.join(" ", values);
    }
}

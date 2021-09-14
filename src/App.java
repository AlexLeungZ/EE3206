import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(message(args));

        var curTime = new java.util.Date();
        var randInt = new Random(curTime.getTime());

        System.out.println(curTime);
        for (int i = 0; i < 10; i++)
            System.out.print(randInt.nextInt(1000) + " ");
    }

    public static String message(String... values) {
        return "Hello, World. " + String.join(" ", values);
    }
}

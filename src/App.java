import java.util.Date;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(message(args));

        // double val = 3.85666;
        // double roundedVal = Double.valueOf(String.format("%.2f", val));
        // System.out.println(roundedVal);

        // var curTime = new Date();
        // System.out.println(curTime);

        // var randInt = new Random(curTime.getTime());
        // for (int i = 0; i < 10; i++)
        // System.out.print(randInt.nextInt(100) + " ");

        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        for (int[] arrI : array)
            for (int arrJ : arrI)
                System.out.print(arrJ);
        System.out.println();

        String mgs = "   e";
        mgs = mgs.trim().toUpperCase();
        System.out.println(mgs);
        System.out.println(mgs.length());

        int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
        System.out.println("Index is " + java.util.Arrays.binarySearch(list, 11));

    }

    public static String message(String... values) {
        return "Hello, World. " + String.join(" ", values);
    }
}

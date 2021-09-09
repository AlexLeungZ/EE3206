public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(message(args));
    }

    public static String message(String... values) {
        return "Hello, World. " + String.join(" ", values);
    }
}

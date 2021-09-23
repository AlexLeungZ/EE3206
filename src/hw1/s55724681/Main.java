package hw1.s55724681;

public class Main {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        double successruns = 0;
        System.out.println("The Monte Carlo simulation result of one million runs:");
        for (int i = 0; i < 1000000; i++) {
            Rat ratatouille = new Rat();
            ratatouille.escape();
            if (ratatouille.inside)
                successruns++;
        }
        System.out.println("Number of succesful escapes: " + successruns);
        System.out.println("Success Rate P: " + Math.floor(successruns / 1000) / 1000);
        // Rat ratatouille = new Rat();
        // ratatouille.escape();

        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: " + (end - start));
    }
}

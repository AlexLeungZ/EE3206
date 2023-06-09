package ex2;

public class TotalArea {

    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        Circle3[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static Circle3[] createCircleArray() {
        Circle3[] circleArray = new Circle3[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle3(10 + Math.random() * 90);
        }

        // Return Circle array
        return circleArray;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(Circle3[] circleArray) {
        System.out.println("Radius\t\t" + "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%.2f\t\t%.2f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("-----------------------------------------");

        // Compute and display the result
        System.out.printf("The total areas of circles is \t %.2f \n", sum(circleArray));
    }

    /** Add circle areas */
    public static double sum(Circle3[] circleArray) {
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}

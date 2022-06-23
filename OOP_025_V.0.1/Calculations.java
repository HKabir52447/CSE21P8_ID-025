package simplecalculator;

/**
 *
 * @author MD.Humayun-kabir
 */
public class Calculations {

    void sum(double a, double b) {
        System.out.println("Summation of " + a + " and " + b + " is: " + (a + b));
        System.out.println("\n=================================================\n");
    }

    void sub(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
        System.out.println("\n=================================================\n");
    }

    void mult(double a, double b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        System.out.println("\n=================================================\n");
    }

    void div(double a, double b) {
        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        System.out.println("\n=================================================\n");
    }

    void mod(double a, double b) {
        System.out.println("Modulas of " + a + " and " + b + " is: " + String.format("%.3f", (a % b)));
        System.out.println("\n=================================================\n");
    }

    void root(double a) {
        System.out.println("Root value of " + a + " is: " + String.format("%.3f", (Math.sqrt(a))));
        System.out.println("\n=================================================\n");
    }

    void max(double a, double b) {
        System.out.println("Maximum value between " + a + " and " + b + " is: " + String.format("%.3f", (Math.max(a, b))));
        System.out.println("\n=================================================\n");
    }

    void min(double a, double b) {
        System.out.println("Minimum value between " + a + " and " + b + " is: " + String.format("%.3f", (Math.min(a, b))));
        System.out.println("\n=================================================\n");
    }

    void sin(double a) {
        double x = Math.toRadians(a);
        System.out.println("sin" + a + " is: " + String.format("%.3f", (Math.sin(x))));
        System.out.println("\n=================================================\n");
    }

    void cos(double a) {
        double x = Math.toRadians(a);
        System.out.println("cos" + a + " is: " + String.format("%.3f", (Math.cos(x))));
        System.out.println("\n=================================================\n");
    }
}

/**Class: Tri
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2024
 */
class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("Incorrect triangle sides");
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle 1: " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(1, 1, 3);
            System.out.println("Triangle 2: " + triangle2.checkSides());

            Triangle triangle3 = new Triangle(1, 2, 3);
            System.out.println("Triangle 3: " + triangle3.checkSides());
        } catch (IllegalTriangleSideException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

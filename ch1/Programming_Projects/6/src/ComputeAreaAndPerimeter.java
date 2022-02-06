import java.util.Scanner;

/**
 Computes the area and perimeter of selected figures.
 @author Koffman and Wolfgang
 */
public class ComputeAreaAndPerimeter {
    /** The main program performs the following steps.
     1. It asks the user for the type of figure.
     2. It asks the user for the characteristics of that figure.
     3. It computes the perimeter.
     4. It computes the area.
     5. It displays the result.
     @param args The command line arguments ‐‐ not used
     */
    public static void main(String args[]) {
        Shape myShape;
        double perimeter;
        double area;
        myShape = getShape(); // Ask for figure type
        myShape.readShapeData(); // Read the shape data
        perimeter = myShape.computePerimeter(); // Compute perimeter
        area = myShape.computeArea(); // Compute the area
        displayResult(myShape, area, perimeter); // Display the result
        System.exit(0); // Exit the program
    }
    /** Ask the user for the type of figure.
     @return An instance of the selected shape
     */
    public static Shape getShape() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter C for circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Right Triangle");
        String figType = in.next();
        if (figType.equalsIgnoreCase("c")) {
            return new Circle();
        }
        else if (figType.equalsIgnoreCase("r")) {
            return new Rectangle();
        }
        else if (figType.equalsIgnoreCase("t")) {
            return new RtTriangle();
        }
        else {
            return null;
        }
    }
    /** Display the result of the computation.
     @param area The area of the figure
     @param perim The perimeter of the figure
     */
    private static void displayResult(Shape myShape, double area, double perim) {
        System.out.println(myShape);
        System.out.printf("The area is %.2f%nThe perimeter is %.2f%n",
                area, perim);
    }
}
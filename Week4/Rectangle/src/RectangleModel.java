public class RectangleModel {
    public static void main(String[] args) {
        System.out.println("No-argument constructor call order:");
        Rectangle defaultRectangle = new Rectangle();
        printDetails(defaultRectangle);

        System.out.println("\nOne-argument constructor call order:");
        Rectangle square = new Rectangle(4);
        printDetails(square);

        System.out.println("\nTwo-argument constructor call order:");
        Rectangle rectangle = new Rectangle(3, 5);
        printDetails(rectangle);

        rectangle.scale(2);
        System.out.println("\nAfter scaling the rectangle: " + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    private static void printDetails(Rectangle rectangle) {
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square: " + rectangle.isSquare());
    }
}

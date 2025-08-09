package absraction.shapes;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,25);
        System.out.println(rectangle.calculateArea());
    }
}

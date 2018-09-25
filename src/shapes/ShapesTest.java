package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter(4, 5));
        System.out.println(box1.getArea(4, 5));

        Rectangle box2 = new Square(5);
    }

}
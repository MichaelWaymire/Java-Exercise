package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter(5));
        System.out.println(box1.getArea(4));
//        Rectangle box2 = new Square(5);

        Measurable myShape = new Rectangle(5,3);
        System.out.println(myShape.getPerimeter());


    }

}
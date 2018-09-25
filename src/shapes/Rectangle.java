package shapes;

public  class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }


//    int length;
//    int width;
//
//
//    protected int getLenght() {
//        return this.length;
//
//    }
//
//    protected int getWidth() {
//        return this.width;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//
//    public static int getArea(int length, int width){
//        int area = length * width;
//        return area;
//    }
//
//
//    public static int getPerimeter(int length, int width){
//        int perimeter = (2 * length) + (2 * width);
//        return perimeter;
//    }
//
//
//
//    public Rectangle(int a, int b) {
//         this.length = a;
//         this.width  = b;
//    }
//
//
//    public abstract int getPerimeter();
//
//    public abstract int getArea();
}



package shapes;

public abstract class Rectangle {


    int length;
    int width;


    protected int getLenght() {
        return this.length;

    }

    protected int getWidth() {
        return this.width;
    }

    public static void main(String[] args) {

    }



    public static int getArea(int length, int width){
        int area = length * width;
        return area;
    }


    public static int getPerimeter(int length, int width){
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    

    public Rectangle(int a, int b) {
         this.length = a;
         this.width  = b;
    }


    public abstract int getPerimeter();

    public abstract int getArea();
}



package shapes;

public class Square extends Quadrilateral {




    public Square(double length) {
        super(length, length);
    }



    public double getPerimeter() {
        return 4*this.length;
    }


    public double getArea(double i) {
        return this.length*2;


    //    public Square(int side) {
//        super(side, side);
//
//
//    }
//
//    @Override
//    public  int getPerimeter(){
//        return 4 * length;
//    }
//    @Override
//    public int getArea(){
//        return length * length;
   }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}






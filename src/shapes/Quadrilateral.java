package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    int length;
    int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}

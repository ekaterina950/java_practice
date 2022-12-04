public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "green";
        width = 20.5;
        length = 10.0;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "green";
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, length:" + this.length + ",width:" + this.width + ",colour:" + this.color + ",filled:" + this.filled;
    }
}
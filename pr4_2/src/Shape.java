public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "BLUE";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.color = colour;
        this.filled = filled;
    }

    public String getColour() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return this.color + " " + this.filled;
    }
}

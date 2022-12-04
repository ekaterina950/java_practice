public class Square extends Rectangle
{
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "green";
        side = 5.0;
    }

    public Square(double side, String color, Boolean filled)
    {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public Square(double side)
    {
        this.side = side;
        this.color = "blue";
        this.filled = true;
    }

    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public String toString()
    {

        return "Square: color" + this.color + " side:" +this.side;
    }

}


public class Circle {
    double radius;
    Point point;
    public Circle(double radius, double x, double y){
        this.radius = radius;
        point = new Point(x,y);
    }
    public void setCircle( double radius,double x, double y){
        this.radius = radius;
        point.setXY(x,y);
    }
    public double getR(){
        return radius;
    }

    public String toString(){
        return "Circle coordinates: (" + point.getX() + "), (" + point.getY() + ") \n radius: " + radius;
    }
}

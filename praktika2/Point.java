public class Point {
    double x = 0.0;
    double y = 0.0;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x,double y){
        this.y = y;
        this.x = x;
    }
    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

}
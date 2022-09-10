public class Circle {
    private int radius;
    private int x,y;
    public Circle(int x, int y, int radius){
        this.radius = radius;
        this.x = x;
        this.y =y;
    }
    public void setter(int radius){
        this.radius=radius;
    }
    public double getter(){
        return radius;
    }
    public double S(){
        return 3.14*radius*radius;
    }
    public double P(){
        return 2*3.14*radius;
    }
    public void setterx(int x){
        this.x=x;
    }
    public int getterx(){
        return x;
    }
    public void settery(int y){
        this.y=y;
    }
    public int gettery(){
        return y;
    }
}

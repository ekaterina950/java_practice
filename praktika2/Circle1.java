public class Circle1 {
    double radius;
    public Circle1( double radius){

        this.radius = radius;
    }

    public double getR(){
        return radius;
    }

    public void setR(double radius){
        this.radius = radius;
    }
    public double P(){
        return 2*3.14*radius;
    }
    public double S(){
        return 3.14*radius*radius;
    }
    public void isEqual(Circle1 a,Circle1 b){
        System.out.println(a.equals(b));

    }
    public String toString(){
        return "radius: " + radius;
    }


}

public class MathFunc implements MathCalculable{
    public double l_circle(double r){

        return 2*Pi*r;
    }

    @Override
    public double pow(double x, int power) {
        double cur=x;
        for(int i=1;i<power;i++){
            x*=cur;
        }
        return x;
    }

    @Override
    public double complex_module(double m, double md) {

        return Math.sqrt(pow(m, 2) + pow(md, 2));
    }
}

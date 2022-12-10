public class TestMath {
    public static void main(String[] args) {
        MathFunc a=new MathFunc();
        System.out.println("Возведение 3 в степень 3: "+a.pow(3,3));
        System.out.println("Модуль комплексного числа 2+3i: "+a.complex_module(2,3));
        System.out.println("Длинна окружности с радиусом 2: "+a.l_circle(2));
    }
}

public class TestNameable {
    public static void main(String[] args) {
        Animal obj1 = new Animal("sobaka");
        System.out.println(obj1.getName()+ "\n");
        Person obj2 = new Person("John");
        System.out.println(obj2.getName()+ "\n");
        Car obj3= new Car("tesla");
        System.out.println(obj3.getName());


    }
}

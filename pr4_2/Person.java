public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void move(){
        System.out.println(name+" двигается");
    }
    public void talk(){
        System.out.println(name+" говорит");
    }
}

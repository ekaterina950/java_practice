public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int perevodVozrast(){
        int age1 = age;
        return age1*7;
    }
    @Override
    public String toString(){
        String n = "name: " + name + "\n" + "age real: " + age ;
        return n;
    }

}

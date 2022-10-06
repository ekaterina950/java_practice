public class Employee {
    private double salary;
    private String name;

    public Employee(double salary, String name){
        this.salary = salary;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString(){
        String z = String.format("%.2f",salary);
        return "name: " + name + " salary: " + z + "\n";
    }
}

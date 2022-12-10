public class Employer {
    private String firstName;
    private String lastName;
    private int income;
    private int averageSum;
    public Employer(){}
    public Employer(String firstName, String lastName, int income){
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public Employer(String firstName, String lastName, int income, int averageSum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.averageSum = averageSum;
    }
    public int getIncome(){
        return income;
    }
}

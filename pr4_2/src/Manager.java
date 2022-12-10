public class Manager extends Employer{
    private String firstName;
    private String lastName;
    private int income;
    private double averageSum;

    public Manager(String firstName, String lastName, int income, int averageSum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.averageSum = averageSum;
    }
    @Override
    public int getIncome(){
        int k = (int) (income+ 12*averageSum);
        return k;
    }
}

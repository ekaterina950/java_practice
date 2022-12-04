public class TestEmployer {
    public static void main(String[] args) {
        Employer obj1 = new Manager("John","Cooper", 204, 123);
        Employer obj2 = new Employer("John","Cooper", 304);
        Employer obj3 = new Employer("John","Cooper", 404);
        Employer obj4 = new Manager("John","Cooper", 504, 123);
        Employer[] obj = new Employer[] {obj1, obj2, obj3, obj4};
        for (int i=0; i<obj.length;i++){
            int k =i+1;
            System.out.println(k+ " чел имеет: "+obj[i].getIncome());

        }


    }
}

public class Phone {
    private int num;
    private int weight;
    private String model;

    public Phone(){};
    public Phone(int num, String model){
        this.num = num;
        this.model = model;
    }

    public Phone(int num, int weight, String model){
        this(num, model);
        this.weight = weight;
    }

    public void call(String name){
        System.out.println("Звонит " + name);
    }

    public void call(String name, int number){
        System.out.println("Звонит " + name+ " с телефона: " + number);
    }

    public int getNum(){
        return num;
    }
    public int msg(int number){
        return number;
    }


}

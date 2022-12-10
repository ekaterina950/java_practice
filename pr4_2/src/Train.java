public class Train extends Transport{
    private int path;
    private int passengers;
    private int goods;

    public Train(int path, int passengers, int goods){
        this.passengers = passengers;
        this.path = path;
        this.goods = goods;
    }

    public  void getPricePass(){
        int k = passengers* 5000;
        System.out.println("Стоимость проезда для пассажиров: "+ k);
    }
    public  void getPriceGoods(){
        int k = goods*300;
        System.out.println("Стоимость проезда для товаров: "+ k);

    }
    public  void getTimePath(){
        int k = path*6;
        System.out.println("Время поездки: "+ k);
    }
}

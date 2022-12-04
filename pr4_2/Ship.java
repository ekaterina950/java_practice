public class Ship extends Transport{
    private int path;
    private int passengers;
    private int goods;

    public Ship(int path, int passengers, int goods){
        this.passengers = passengers;
        this.path = path;
        this.goods = goods;
    }

    public  void getPricePass(){
        int k = passengers* 2000;
        System.out.println("Стоимость проезда для пассажиров: "+ k);
    }
    public  void getPriceGoods(){
        int k = goods*400;
        System.out.println("Стоимость проезда для товаров: "+ k);

    }
    public  void getTimePath(){
        int k = path*4;
        System.out.println("Время поездки: "+ k);
    }
}

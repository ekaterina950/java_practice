public abstract class Transport {
    private int path;
    private int passengers;
    private int goods;

    public abstract void getPricePass();
    public abstract void getPriceGoods();
    public abstract void getTimePath();
}

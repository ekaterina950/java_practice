

enum Brand{
    ASUS,
    APPLE,
    SAMSUNG
}
public class Computer  {
    private Brand brand;
    private String name;

    private double price;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, String name,  int price,
                    Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.name = name;

        this.price = price;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }


    public double getPrice() {
        return price;
    }


    public String getName() {
        return this.name;
    }


    public void print() {
        System.out.print("Brand: "+brand+"\t Name: "+name+"\t Price: "+getPrice()+"\tProcessor: ");
        processor.print();
        System.out.print(" \nMonitor: ");
        monitor.print();
        System.out.print(" \nMemory: ");
        memory.print();

    }
}

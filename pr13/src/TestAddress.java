public class TestAddress {
    public static void main(String[] args) {

        Address address1 = new Address("Россия, Москва, Москва и область, Дмитровское шоссе, 15, 3, 20", true);
        Address address2 = new Address("Россия; Москва; Москва и область; Дмитровское шоссе; 15; 3; 20", false);
        System.out.println("Задание 3:\n" + address1 + "\n" + address2);

    }
}

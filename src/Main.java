

/*
4. Разработайте и реализуйте класс Dog (Собака), поля класса описывают кличку и возраст собаки.
Необходимо выполнить следующие действия: определить конструктор собаки, чтобы принять и инициализировать данные экземпляра.,
 включить стандартные методы  (аксессоры) для получения и установки для имени и возраста,
 включить метод для перевода возраста собаки в "человеческий " возраст (возраст семь раз собаки),
  включите метод ToString, который возвращает описание экземпляра собаки в виде строки.
  Создание класса тестера под названием ПитомникСобак,
  реализует массив собак и основной метод этого класса позволяет добавить в него несколько объектов собаки.
*/
public class Main {
    public static void main(String[] args) {
       /* Shape kvadratik = new Shape("kvadrat" , "red" , "small");
        System.out.println(kvadratik.toString()); */
        // ЗАДАНИЕ 2.................................................................................
        /*Myach myach1 = new Myach(25, "basket", 20);
        System.out.println(myach1.getter());*/
        //ЗАДАНИЕ 3..................................................................................
        /*Kniga kniga1 = new Kniga(7492342, "tolstoy", true);
        System.out.println(kniga1.getter());*/
        //ЗАДАНИЕ 4....................................................................................

        Dog dog1 = new Dog(15, "bob");
        System.out.println(dog1.perevodVozrast());
        System.out.println(dog1.getName());
        dog1.setAge(10);
        System.out.println(dog1.getAge());
        System.out.println(dog1.toString());
        Pitomnik pesiki = new Pitomnik();
        pesiki.adder("lada");
        System.out.println(pesiki.getter());

    }
}
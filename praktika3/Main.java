
/*
2.Создать класс, описывающий тело человека(Human).
 Для описания каждой
3.Создать класс, описывающий книгу (Book). В классе должны быть описаны нужные свойства книги(автор, название, год написания и т. д.)и методы для получения, изменения этих свойств. Протестировать работу класса в классе BookTest, содержащим метод статический main(String[] args).
*/

public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 3..........................................................
        Circle circle = new Circle(5,8,9);
        System.out.println(circle.getterx());
        circle.settery(9999);
        System.out.println(circle.gettery());
// ЗАДАНИЕ 2.................................................................

        Human human = new Human("blue", 22, 17,19);
        System.out.println(human.toString());
        // ЗАДАНИЕ 3................................................................................................
        Book book = new Book("tolstoy", "voina i mir", 78932);
        System.out.println(book.toString());
    }
}
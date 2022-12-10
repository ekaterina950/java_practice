public class TestString {
    public static void main(String[] args) {
        String s="hello world!";
        ProcessStrings a=new ProcessStrings(s);
        System.out.println("String: "+s);
        System.out.println("Number of characters without spaces: "+a.K_char());
        System.out.println("String on odd positions: "+a.odd_positions());
        System.out.println("Reverse string: "+a.reverse());
    }
}

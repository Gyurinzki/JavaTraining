package stringtype;

public class StringTypeMain {


    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + name;
        System.out.println(message);
        String b = message ;
        System.out.println(message + 444);
        String c = message;
        System.out.println(message.length());

        System.out.println(message.substring(3, 8));

    }
}

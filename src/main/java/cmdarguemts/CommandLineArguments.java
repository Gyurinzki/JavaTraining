package cmdarguemts;

public class CommandLineArguments {

    public static void main(String[] args) {
        System.out.println(args.length);
        for (String s : args) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

}

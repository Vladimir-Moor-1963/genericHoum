import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите записать?");

        String string = scanner.nextLine();
        Message<String> stringMessage = new Message<>(scanner.nextLine());

        Integer integer = scanner.nextLine();
        Message<Integer> integerMessage = new Message<>(scanner.nextLine());



        if (scanner.nextLine() == string)
            System.out.println("пишите " + stringMessage);
        else {
            System.out.println("Дайте число " + integerMessage );
        }










    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите записать?");
        System.out.println("1 строка");
        System.out.println("2 число");

        int result = scanner.nextInt();
        scanner.nextLine();
        switch (result){
            case 1:
                System.out.println("строка");
                String string = scanner.nextLine();
                Message<String> stringMessage = new Message<>(string);
                System.out.println("успешно " + stringMessage);
                break;
            case 2:
                System.out.println("число");
                int number = scanner.nextInt();
                Message<Integer> integerMessage = new Message<>(number);
                System.out.println("успешно " + integerMessage);
                break;


        }










    }







    }


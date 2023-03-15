import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Первое число " + a);
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Второе число "+ b);
        System.out.println("Введите один из символов (+, -, *, /): ");
        int ans;
        char c;
        c = scanner.next().charAt(0);
        switch(c) {
            case '+': ans = a + b;
                break;
            case '-': ans = a - b;
                break;
            case '*': ans = a * b;
                break;
            case '/': ans = a / b;
                break;
            default:  System.out.printf("Ошибка, введите один из символов (+, -, *, /)");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");

        System.out.println("Ответ: " + ans);
    }
}
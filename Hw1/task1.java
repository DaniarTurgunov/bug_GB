package Hw1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа: ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        div(a,b);
        scanner1.close();
    }
    public static int div (int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        int result = a / b;
        System.out.println(result);
        return result;
    }
}

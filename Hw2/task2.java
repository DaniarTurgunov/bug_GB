package Hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Рузельтат равен " + div(a,b));
        }catch (DivisionByZeroException e){
            System.out.println("Ошибка " + e.getMessage() );;
        }catch (InputMismatchException e){
            System.out.println("Ошибка некорректный ввод");
        }
        scanner.close();
    }
    public static int div(int a, int b) throws DivisionByZeroException {
        if (b == 0){
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }else{
            return a/b;
        }
    }
}
class DivisionByZeroException extends Exception{
    public DivisionByZeroException (String s){
        super(s);
    }
}

package Hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа ниже");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            test(a,b,c);
        }catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e){
            System.out.println("Ошибка: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Ошибка: некорректный ввод");
        }
        sc.close();
    }
    public static void test(int a, int b, int c) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (a > 100){
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0){
            throw  new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a+b < 10){
            throw  new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");
    }
}
class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException (String s){
        super(s);
    }
}
class NumberSumException extends Exception{
    public NumberSumException (String s){
        super(s);
    }
}

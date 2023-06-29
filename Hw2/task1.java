package Hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        try{
            int num = sc.nextInt();
            zero(num);
        }catch (InvalidNumberException e){
            System.out.println("Ошибка " + e.getMessage());
        }catch (InputMismatchException x){
            System.out.println("Ошибка некорректный ввод");
        }
        sc.close();
    }
    public static void zero (int num) throws InvalidNumberException{
        if (num <= 0){
            throw new InvalidNumberException("Некорректное число");
        }
        System.out.println("Число корректно");
    }
}
class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}

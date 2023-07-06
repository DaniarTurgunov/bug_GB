package Hw3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите основание");
            int a = sc.nextInt();
            System.out.println("Введите степень");
            int b = sc.nextInt();
            int res = calculatePower(a, b);
            System.out.println("Результат равен " + res);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            ;
        } catch (Exception e) {
            System.out.println("Ошибка ввода: введены некорректные числа");
        }
        sc.close();
    }
    public static int calculatePower(int a, int b) throws InvalidInputException{
        if (a == 0 && b < 0) {
            throw new InvalidInputException ("Ошибка некорректное основание и отрицательная степень");
        }
        return (int) Math.pow(a,b);
    }
    static class InvalidInputException extends Exception{
        public InvalidInputException (String s){
            super(s);
        }
    }
}
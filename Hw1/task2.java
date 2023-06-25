package Hw1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        System.out.println(age);
        if (nums(age)){
            System.out.println("Ваш возраст " + age + " лет");
        }else{
            throw new NumberFormatException("Некорректный ввод");
        }
        scanner.close();
    }
    public static boolean nums(String s){
        try{
            parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
package Hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "tbyla" + separator + "JJAVA Gb" + separator + "bugGB" + separator
                + "src" + separator + "Hw1" + separator + "tsk3.txt";
        File nm = new File(path);
        int result = 0;
        Scanner sc = new Scanner(nm);
        while (sc.hasNextLine()) {
            String i = sc.nextLine();
            try {
                result += Integer.parseInt(i);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Некорректное значение числа в файле");
            }finally {
                System.out.println(result);
            }
        }
    }
}
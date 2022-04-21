package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Test14");
    printResult(file);
    }

    public static void printResult(File file){

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        scanner.close();

       int sum = 0;
        for (String number : numbersString)
            sum += Integer.parseInt(number);

        double result = sum/(double) numbersString.length;

      System.out.printf(result +  " --> %.3f", result);


    }
}


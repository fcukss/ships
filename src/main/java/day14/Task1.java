package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test14");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
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
        int[] numbers = new int[10];

        if (numbers.length != 10)
            throw new ArrayIndexOutOfBoundsException();

        int counter = 0;
        scanner.close();

        int sum = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
            sum = 0;
            for (int i = 0; i < numbers.length; ++i) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}

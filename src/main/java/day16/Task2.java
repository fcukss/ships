package day16;

import com.sun.source.tree.NewArrayTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        Scanner scanner = null;
        PrintWriter pw1 = null;
        PrintWriter pw2 = null;
        try {
            pw1 = new PrintWriter(file1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100);
            pw1.println(a);
        }
        pw1.close();

        try {
            scanner = new Scanner(file1);
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        scanner.close();


        printResult(file2);
    }

    public static void printResult(File file2) {
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("файл не найден");
        }
        double result = 0;
        while (scanner1.hasNextLine()) {
            result += Double.parseDouble(scanner1.nextLine());
        }
        System.out.println((int)result);
    }
}

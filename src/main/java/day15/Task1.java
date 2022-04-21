package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");
        File writeInFile = new File("src/main/resources/missing_shoes.txt");

        List<String> list = new ArrayList<>(Arrays.asList());

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(writeInFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("файл не найден");
        }

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] shoes = line.split(";");


                if (Integer.parseInt(shoes[2]) == 0)
                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);


            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        }
    }
}

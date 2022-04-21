package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(text);
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Point> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] stringCars = line.split(" ");
            map.put(Integer.parseInt(stringCars[0]), new Point(Integer.parseInt(stringCars[1]), Integer.parseInt(stringCars[2])));
        }
        // System.out.println(map);

        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        scanner.close();
        // (x0>x1 И y0>y1 И x0<x2 И y0<y2)  нахождение точки в квадрате
        int sumOfCars = 0;
  //      int noCars = 0;
        for (Map.Entry<Integer, Point> item : map.entrySet())
        {
            if (item.getValue().getX() > x1 && item.getValue().getY() > y1 && item.getValue().getX() < x2 && item.getValue().getY() < y2)
            {
                sumOfCars++;
                System.out.println(item.getKey());
            }// else {
      //          noCars++;
       //     }
        }
  //      System.out.println("There is no car " + noCars);
        System.out.println("There are: " + sumOfCars + " cars");
    }
}

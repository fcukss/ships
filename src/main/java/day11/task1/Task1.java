package day11.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>( Arrays.asList("Audi", "BMW", "Lada", "Tesla", "KIA"));
        auto.add(3,"VW");
        auto.remove(0);
        System.out.println(auto);
    }

}

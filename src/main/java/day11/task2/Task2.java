package day11.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
           List<Integer> arrayList = new ArrayList<>();
            for( int i = 0; i<= 30; i++){
                i= i+i%2;
                arrayList.add(i);
            }

        for( int x = 300; x<= 350; x++){
            x= x+x%2;
            arrayList.add(x);
        }
        System.out.println(arrayList);
    }
}

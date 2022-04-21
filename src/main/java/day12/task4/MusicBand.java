package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public MusicBand(String name, int year,List<String>members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand a, MusicBand b) {
      for (String members : a.getMembers())
          b.getMembers().add(members);
      a.getMembers().clear();
    }

    public void printMembers(List<String> members){
        System.out.println(members);
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }
}

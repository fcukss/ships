package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


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

    public MusicBand(String name, int year, List<MusicArtist>members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand a, MusicBand b) {
      for (MusicArtist members : a.getMembers())
          b.getMembers().add(members);
      a.getMembers().clear();
    }

    public void printMembers(List<MusicArtist> members){
        System.out.println(members);
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }
}

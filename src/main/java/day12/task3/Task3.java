//package day12.task3;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Task3 {
//    public static void main(String[] args) {
//
//        MusicBand band10 = new MusicBand("Mettalica", 1981);
//        MusicBand band1 = new MusicBand("Korn", 1993);
//        MusicBand band2 = new MusicBand("Agata", 1985);
//        MusicBand band3 = new MusicBand("Tartak", 1996);
//        MusicBand band4 = new MusicBand("Okean", 1999);
//        MusicBand band5 = new MusicBand("Zadan", 2000);
//        MusicBand band6 = new MusicBand("b2", 1981);
//        MusicBand band7 = new MusicBand("fpg", 1998);
//        MusicBand band8 = new MusicBand("antutila", 2001);
//        MusicBand band9 = new MusicBand("Mettalica3", 2005);
//
//        List<MusicBand> musicBands = new ArrayList<>();
//        musicBands.add(band10);
//        musicBands.add(band1);
//        musicBands.add(band2);
//        musicBands.add(band3);
//        musicBands.add(band4);
//        musicBands.add(band5);
//        musicBands.add(band6);
//        musicBands.add(band7);
//        musicBands.add(band8);
//        musicBands.add(band9);
//        System.out.println(musicBands);
//
//        Collections.shuffle(musicBands);
//        System.out.println(musicBands);
//
//        List<MusicBand> groupsAfter2000 = new ArrayList<>();
//        for (MusicBand band : musicBands) {
//            if (band.getYear() > 2000)
//                groupsAfter2000.add(band);
//        }
//        System.out.println(groupsAfter2000);
//
//        groupsAfter2000(musicBands);
//    //groupsAfter2000(List<MusicBand> bands);
//    }
//
//    public static List<MusicBand>groupsAfter2000(List<MusicBand> bands) {
//
//       return bands;
//    }
//}
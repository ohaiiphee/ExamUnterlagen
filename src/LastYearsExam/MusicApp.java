package LastYearsExam;

public class MusicApp {
    public static void main(String[] args) {
        Album a = new Album();
        a.shortestSong = 20;
        a.longestSong = 40;
        a.nrSongs = 10;

        System.out.println(a.averageSongLength());
        System.out.println(a.totalLength());
        System.out.println(a.fitsOnMedium(76));
    }
}

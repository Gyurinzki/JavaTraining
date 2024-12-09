package training;

public class SongMain {

    public static void main(String[] args) {
        Song Song = new Song();
        Song.Band = "Brintey Spears";
        Song.Title = "Oops!... I Did It Again";
        Song.length = 4;
        System.out.println(Song.Band);
        System.out.println(Song.Title);
        System.out.println(Song.length + " perc");

    }

}

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        Song s = new Song();
        s.setName("1999");
        s.setAlbum("1999");
        s.setArtist("Price");
        s.setRating(10);

        System.out.println("The song name was " + s.getName());
        System.out.println("The artist name is " + s.getArtist());
        System.out.println("The album name is" + s.getAlbum());
        System.out.println("The rating was " + s.getRating() + "and the year it came out was" + s.getYear());

        ArrayList<Song> mySongs = new ArrayList<>();
        mySongs.add(s);

    }
}

import java.util.*;

public class Hashmatique{

    public HashMap<String, String> getLyrics () {
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add songs
        trackList.put("Dear Mama", "Lyrics_1");
        trackList.put("Free Fallin'", "Lyrics_2");
        trackList.put("Grapevine Fires", "Lyrics_3");
        trackList.put("Start Me Up", "Lyrics_4");

        // Retrieve & print lyrics based on track title
        System.out.println(trackList.get("Grapevine Fires"));

        // Print out all track names and lyrics
        Set<String> tracksAndLyrics = trackList.keySet();
        for (String key : tracksAndLyrics){
            System.out.println(key + " : " + trackList.get(key));
        }
        return trackList;
    }


}
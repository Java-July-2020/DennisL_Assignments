import java.util.*;

public class HashMapTest{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Numb", "I'm tired of being what you want me to be Feeling so faithless");
        trackList.put("In The End", "One thing I don't know why It doesn't even matter how hard you try");
        trackList.put("On Bended Knee", "Can we go back to the days our love was strong?");
        trackList.put("No Diggity", "I like the players No diggity, no doubt, yeah");

        System.out.println(trackList.get("In The End"));

        for (HashMap.Entry<String, String> entry : trackList.entrySet()){
            System.out.println("Track: " + entry.getKey() + " Lyrics: " + entry.getValue());
        }
    }
}
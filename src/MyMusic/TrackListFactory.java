package MyMusic;

import java.util.ArrayList;
//The TrackListFactory class provides a factory method getTrackList that creates and returns an instance of the ArrayList<Track> class based on the provided input parameters.
public class TrackListFactory {
    public ArrayList<Track> getTrackList(String owner, User user, int id) {
        ArrayList<Track> trackList = null;
        if (owner.equals("Artist")) {
            trackList = DatabaseManager.getInstance().getTracksByArtist(user, id);
        }
        else if (owner.equals("Album")) {
            trackList = DatabaseManager.getInstance().getTracksInAlbum(user, id);
        }
        else {
            System.out.println("Error");

        }
        return trackList;
    }
}

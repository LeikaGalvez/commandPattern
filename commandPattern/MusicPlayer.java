package commandPattern;

public class MusicPlayer {
    public void startPlaylist(){
        System.out.println("Playing current playlist: \"Study Playlist <3\"\n");
    }
    public void stopPlaylist(){
        System.out.println("Stopping current playlist: \"Study Playlist <3\"\n");
    }
    public void increaseVolume(){
        System.out.println("Increased volume by 5.\n");
    }
    public void decreaseVolume(){
        System.out.println("Decreased volume by 5.\n");
    }
}

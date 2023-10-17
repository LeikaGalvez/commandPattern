package commandPattern;

public class StopPlaylist implements Command{
    private MusicPlayer musicPlayer;

    public StopPlaylist(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stopPlaylist();
    }
}

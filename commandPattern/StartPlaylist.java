package commandPattern;

public class StartPlaylist implements Command{
    private MusicPlayer musicPlayer;

    public StartPlaylist(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.startPlaylist();
    }
}

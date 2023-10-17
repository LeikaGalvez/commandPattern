package commandPattern;

public class DecreaseVolume implements Command{
    private MusicPlayer musicPlayer;

    public DecreaseVolume(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.decreaseVolume();
    }
}

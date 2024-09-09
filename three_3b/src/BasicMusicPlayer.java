public class BasicMusicPlayer implements MusicPlayer {
    protected MusicSource musicSource; 
    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.load(); 
        System.out.println("Playing music...");
    }
}

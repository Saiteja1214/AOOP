public class MusicPlayer implements MusicSource {
    protected MusicSource musicSource; 
    public MusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play(); 
    }
}


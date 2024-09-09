public class EqualizerDecorator extends MusicPlayer {
    public EqualizerDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Applying equalizer settings...");
    }
}

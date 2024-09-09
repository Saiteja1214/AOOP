public class VolumeControlDecorator extends MusicPlayer {
    public VolumeControlDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Adjusting volume...");
    }
}

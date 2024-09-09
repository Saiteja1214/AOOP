public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Adjusting volume...");
    }
}


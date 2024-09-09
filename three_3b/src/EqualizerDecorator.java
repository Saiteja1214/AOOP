public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Applying equalizer settings...");
    }
}


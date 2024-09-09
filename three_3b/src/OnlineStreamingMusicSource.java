public class OnlineStreamingMusicSource implements MusicSource {
    private String url;

    public OnlineStreamingMusicSource(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        System.out.println("Loading music from online streaming service: " + url);
    }
}

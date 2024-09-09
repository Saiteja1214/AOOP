public class OnlineStreamingMusicSource implements MusicSource {
    private String url; 

    public OnlineStreamingMusicSource(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from online service: " + url);
    }
}


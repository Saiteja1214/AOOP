public class RadioStationMusicSource implements MusicSource {
    private String stationName;

    public RadioStationMusicSource(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void load() {
        System.out.println("Loading radio station: " + stationName);
    }
}

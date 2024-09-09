public class RadioStationMusicSource implements MusicSource {
    private String stationName; 

    public RadioStationMusicSource(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Tuning into radio station: " + stationName);
    }
}

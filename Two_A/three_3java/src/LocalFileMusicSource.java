public class LocalFileMusicSource implements MusicSource {
    private String fileName; // Name of the local file to be played

    public LocalFileMusicSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing music from local file: " + fileName);
    }
}


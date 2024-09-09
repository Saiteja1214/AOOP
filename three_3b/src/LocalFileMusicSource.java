public class LocalFileMusicSource implements MusicSource {
    private String fileName;

    public LocalFileMusicSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void load() {
        System.out.println("Loading music from local file: " + fileName);
    }
}

import java.util.Scanner;

public class MusicStreamingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a music source:");
        System.out.println("1. Local File");
        System.out.println("2. Online Streaming");
        System.out.println("3. Radio Station");
        int choice = scanner.nextInt();
        scanner.nextLine();

        MusicSource musicSource = null;

        switch (choice) {
            case 1:
                System.out.println("Enter file name:");
                String fileName = scanner.nextLine();
                musicSource = new LocalFileMusicSource(fileName);
                break;
            case 2:
                System.out.println("Enter streaming URL:");
                String url = scanner.nextLine();
                musicSource = new OnlineStreamingMusicSource(url);
                break;
            case 3:
                System.out.println("Enter radio station name:");
                String stationName = scanner.nextLine();
                musicSource = new RadioStationMusicSource(stationName);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        
        MusicPlayer player = new BasicMusicPlayer(musicSource);

        
        System.out.println("Do you want to apply equalizer? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            player = new EqualizerDecorator(player);
        }

        System.out.println("Do you want to adjust volume? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            player = new VolumeControlDecorator(player);
        }

        System.out.println("Playing music...");
        player.play();
        
        scanner.close();
    }
}

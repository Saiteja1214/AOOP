package ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {

    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song by Name");
            System.out.println("3. Move Song to a Different Position");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    playlist.add(song);
                    System.out.println("Song added to the playlist.");
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    if (playlist.remove(songToRemove)) {
                        System.out.println("Song removed from the playlist.");
                    } else {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the song name to move: ");
                    String songToMove = scanner.nextLine();
                    if (playlist.contains(songToMove)) {
                        System.out.print("Enter the new position (1-based index): ");
                        int newPosition = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        if (newPosition > 0 && newPosition <= playlist.size()) {
                            playlist.remove(songToMove);
                            playlist.add(newPosition - 1, songToMove);
                            System.out.println("Song moved to position " + newPosition + ".");
                        } else {
                            System.out.println("Invalid position.");
                        }
                    } else {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 4:
                    System.out.println("Current Playlist:");
                    for (int i = 0; i < playlist.size(); i++) {
                        System.out.println((i + 1) + ". " + playlist.get(i));
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Music Playlist.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

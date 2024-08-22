package com.AudioPlayer;

public class FileAudioPlayer {
	 private String fileLocation;

	    public FileAudioPlayer(String fileLocation) {
	        this.fileLocation = fileLocation;
	    }

	    public void playFromFile() {
	        System.out.println("Playing audio file from: " + fileLocation);
	    }
}

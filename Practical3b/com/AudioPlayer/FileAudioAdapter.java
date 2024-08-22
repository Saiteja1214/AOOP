package com.AudioPlayer;

public class FileAudioAdapter {
	 private FileAudioPlayer fileAudioPlayer;

	    public FileAudioAdapter(FileAudioPlayer fileAudioPlayer) {
	        this.fileAudioPlayer = fileAudioPlayer;
	    }

	    public void playAudio() {
	        fileAudioPlayer.playFromFile();
	    }
}

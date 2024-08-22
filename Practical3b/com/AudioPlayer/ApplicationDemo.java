package com.AudioPlayer;

public class ApplicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileAudioPlayer localFilePlayer = new FileAudioPlayer("path/to/audio/file.mp3");
	     WebStreamPlayer onlineStreamPlayer = new WebStreamPlayer("http://example.com/stream");
	     RadioAudioPlayer radioPlayer = new RadioAudioPlayer("http://example.com/radio");

	   
	     FileAudioAdapter fileAudioAdapter = new FileAudioAdapter(localFilePlayer);
	     AudioPlayer streamAudioAdapter = new WebStreamAdapter(onlineStreamPlayer);
	     AudioPlayer radioAudioAdapter = new RadioAudioAdapter(radioPlayer);

	     
	     fileAudioAdapter.playAudio();
	     streamAudioAdapter.playAudio();
	     radioAudioAdapter.playAudio();
	 
	}

}

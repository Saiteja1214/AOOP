package com.AudioPlayer;

public class RadioAudioAdapter implements AudioPlayer{
	 private RadioAudioPlayer radioAudioPlayer;

	    public RadioAudioAdapter(RadioAudioPlayer radioAudioPlayer) {
	        this.radioAudioPlayer = radioAudioPlayer;
	    }

	    @Override
	    public void playAudio() {
	        radioAudioPlayer.tuneIn();
	    }
}

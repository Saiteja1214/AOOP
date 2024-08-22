package com.AudioPlayer;

public class RadioAudioPlayer {
	 private String stationLink;

	    public RadioAudioPlayer(String stationLink) {
	        this.stationLink = stationLink;
	    }

	    public void tuneIn() {
	        System.out.println("Tuning into radio station: " + stationLink);
	    }
}

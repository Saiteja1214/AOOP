package com.AudioPlayer;

public class WebStreamPlayer {
	 private String streamLink;

	    public WebStreamPlayer(String streamLink) {
	        this.streamLink = streamLink;
	    }

	    public void playStream() {
	        System.out.println("Streaming audio from: " + streamLink);
	    }
}

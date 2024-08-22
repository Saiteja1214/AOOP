package com.AudioPlayer;

public class WebStreamAdapter implements AudioPlayer{
	  private WebStreamPlayer webStreamPlayer;

	    public WebStreamAdapter(WebStreamPlayer webStreamPlayer) {
	        this.webStreamPlayer = webStreamPlayer;
	    }

	    @Override
	    public void playAudio() {
	        webStreamPlayer.playStream();
	    }
}

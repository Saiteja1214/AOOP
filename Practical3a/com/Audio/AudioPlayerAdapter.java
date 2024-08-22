package com.Audio;

public interface AudioPlayerAdapter extends AudioPlayer{
	 void adjustVolume(int level);
		}
		class LocalAudioPlayerAdapter implements AudioPlayerAdapter {
		 private LocalAudioPlayer localAudioPlayer;

		 public LocalAudioPlayerAdapter(LocalAudioPlayer localAudioPlayer) {
		     this.localAudioPlayer = localAudioPlayer;
		 }
		 @Override
		 public void start() {
		     localAudioPlayer.start();
		 }

		 @Override
		 public void hold() {
		     localAudioPlayer.hold();
		 }

		 @Override
		 public void end() {
		     localAudioPlayer.end();
		 }

		 @Override
		 public void adjustVolume(int level) {
		     System.out.println("Adjusting volume of local audio player to " + level);
		 }
		}
		class WebStreamPlayerAdapter implements AudioPlayerAdapter {
		 private WebStreamPlayer webStreamPlayer;

		 public WebStreamPlayerAdapter(WebStreamPlayer webStreamPlayer) {
		     this.webStreamPlayer = webStreamPlayer;
		 }

		 @Override
		 public void start() {
		     webStreamPlayer.start();
		 }

		 @Override
		 public void hold() {
		     webStreamPlayer.hold();
		 }

		 @Override
		 public void end() {
		     webStreamPlayer.end();
		 }

		 @Override
		 public void adjustVolume(int level) {
		     System.out.println("Adjusting volume of web stream player to " + level);
		 }
		}

		class RadioStationPlayerAdapter implements AudioPlayerAdapter {
		 private RadioStationPlayer radioStationPlayer;

		 public RadioStationPlayerAdapter(RadioStationPlayer radioStationPlayer) {
		     this.radioStationPlayer = radioStationPlayer;
		 }
		 public void start() {
		     radioStationPlayer.start();
		 }
		 public void hold() {
		     radioStationPlayer.hold();
		 }
		 public void end() {
		     radioStationPlayer.end();
		 }
		 public void adjustVolume(int level) {
		     System.out.println("Adjusting volume of radio station player to " + level);
		 }
}

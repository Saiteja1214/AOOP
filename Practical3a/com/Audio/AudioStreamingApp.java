package com.Audio;

public class AudioStreamingApp {

	public static void main(String[] args) {
		 AudioPlayer localAudioPlayer = new LocalAudioPlayer();
	        AudioPlayer streamingAudioPlayer = new WebStreamPlayer();
	        AudioPlayer radioStationAudioPlayer = new RadioStationPlayer();

	        AudioPlayerAdapter localAudioPlayerAdapter = new LocalAudioPlayerAdapter((LocalAudioPlayer) localAudioPlayer);
	        AudioPlayerAdapter streamingAudioPlayerAdapter = new WebStreamPlayerAdapter((WebStreamPlayer) streamingAudioPlayer);
	        AudioPlayerAdapter radioStationAudioPlayerAdapter = new RadioStationPlayerAdapter((RadioStationPlayer) radioStationAudioPlayer);

	        AudioPlayerAdapter enhancedLocalAudioPlayer = new EqualizerEnhancer(new VolumeAdjusterEnhancer(localAudioPlayerAdapter));
	        AudioPlayerAdapter enhancedStreamingAudioPlayer = new VolumeAdjusterEnhancer(new EqualizerEnhancer(streamingAudioPlayerAdapter));
	        
	        System.out.println("Local Audio Player:");
	        enhancedLocalAudioPlayer.start();
	        enhancedLocalAudioPlayer.adjustVolume(10);
	        ((EqualizerEnhancer) enhancedLocalAudioPlayer).configureEqualizer("Rock");

	        System.out.println("\nWeb Stream Player:");
	        enhancedStreamingAudioPlayer.start();
	        enhancedStreamingAudioPlayer.adjustVolume(20);


	        System.out.println("\nRadio Station Player:");
	        radioStationAudioPlayerAdapter.start();
	        radioStationAudioPlayerAdapter.adjustVolume(15);
	    }

	}



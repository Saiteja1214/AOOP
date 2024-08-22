package com.Audio;

public abstract class AudioPlayerEnchancer implements AudioPlayerAdapter{
	protected AudioPlayerAdapter enhancedPlayer;

	 public void AudioPlayerEnhancer(AudioPlayerAdapter enhancedPlayer) {
	     this.enhancedPlayer = enhancedPlayer;
	 }
	 @Override
	 public void start() {
	     enhancedPlayer.start();
	 }

	 @Override
	 public void hold() {
	     enhancedPlayer.hold();
	 }

	 @Override
	 public void end() {
	     enhancedPlayer.end();
	 }

	 @Override
	 public void adjustVolume(int level) {
	     enhancedPlayer.adjustVolume(level);
	 }
	}

	class EqualizerEnhancer extends AudioPlayerEnchancer {
	 public EqualizerEnhancer(AudioPlayerAdapter enhancedPlayer) {
	     super();
	 }
	 public void configureEqualizer(String mode) {
	     System.out.println("Configuring equalizer to " + mode);
	 }
	}
	class VolumeAdjusterEnhancer extends AudioPlayerEnchancer {
	 public VolumeAdjusterEnhancer(AudioPlayerAdapter enhancedPlayer) {
	     super();
	 }
	 @Override
	 public void adjustVolume(int level) {
	     super.adjustVolume(level);
	     System.out.println("Applying volume adjustment settings.");
	 }
}

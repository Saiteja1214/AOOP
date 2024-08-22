package com.Audio;

public class LocalAudioPlayer implements AudioPlayer {
	 @Override
	 public void start() {
	     System.out.println("Starting playback of local audio file.");
	 }

	 @Override
	 public void hold() {
	     System.out.println("Holding playback of local audio file.");
	 }

	 @Override
	 public void end() {
	     System.out.println("Ending playback of local audio file.");
	 }
	}

	class WebStreamPlayer implements AudioPlayer {
	 @Override
	 public void start() {
	     System.out.println("Starting playback of online streaming audio.");
	 }

	 @Override
	 public void hold() {
	     System.out.println("Holding playback of online streaming audio.");
	 }

	 @Override
	 public void end() {
	     System.out.println("Ending playback of online streaming audio.");
	 }
	}

	class RadioStationPlayer implements AudioPlayer {
	 @Override
	 public void start() {
	     System.out.println("Starting playback of radio station audio.");
	 }

	 @Override
	 public void hold() {
	     System.out.println("Holding playback of radio station audio.");
	 }

	 @Override
	 public void end() {
	     System.out.println("Ending playback of radio station audio.");
	 }
}

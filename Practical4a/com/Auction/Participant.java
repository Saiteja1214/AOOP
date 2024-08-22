package com.Auction;

public class Participant implements AuctionListen{
	private String participantName ;
	 public Participant(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Participant(String participantName) {
	     this.participantName = participantName;
	 }

	 public void onEvent(String eventCategory, String details) {
	     System.out.println("Participant " + participantName + " received update: [" + eventCategory + "] " + details);
	 }

	 public String getName() {
	     return participantName;
	 }
}

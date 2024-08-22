package com.Auction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AuctionEvent auction = new AuctionEvent("Vintage Watch");
	        Participant participant1 = new Participant("Emily");
	        Participant participant2 = new Participant("Michael");
	        Participant participant3 = new Participant("Sarah");
	        auction.addListener(participant1);
	        auction.addListener(participant2);
	        auction.itemAvailable();
	        auction.startAuction();
	        auction.addListener(participant3);
	        auction.endAuction();
	        auction.removeListener(participant1);
	        auction.startAuction();
	    }
	}



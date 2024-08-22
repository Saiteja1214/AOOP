package com.Auction;

public interface AuctionSubject {
	void addListener(AuctionListen listener);
	 void removeListener(AuctionListen listener);
	 void notifyListeners(String eventCategory, String details);
}

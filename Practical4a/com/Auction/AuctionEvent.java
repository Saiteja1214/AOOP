package com.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionEvent implements AuctionSubject{
	private final List<AuctionListen> listeners;
    private final String itemName;


    public AuctionEvent(String itemName) {
        this.itemName = itemName;
        this.listeners = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
	public void addListener1(AuctionListen listener) {
        ((List<AuctionListen>) listener).add(listener);
    }

    public void removeListener1(AuctionListen listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(String eventCategory, String details) {
        for (AuctionListen listener : listeners) {
            listener.onEvent(eventCategory, details);
        }
    }

    public void startAuction() {
        notifyListeners("Auction Started", "Bidding has commenced for " + itemName);
    }

    public void endAuction() {
        notifyListeners("Auction Ended", "Bidding has concluded for " + itemName);
    }

    public void itemAvailable() {
        notifyListeners("Item Available", itemName + " is available for bidding.");
    }

	@Override
	public void addListener(AuctionListen listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(AuctionListen listener) {
		// TODO Auto-generated method stub
		
	}
}

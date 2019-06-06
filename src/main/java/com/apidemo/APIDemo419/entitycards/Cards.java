package com.apidemo.APIDemo419.entitycards;

public class Cards {
	private String success;
	private String deck_id;
	private String shuffled;
	private String remaining;

	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getDeck_id() {
		return deck_id;
	}

	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}

	public String getShuffled() {
		return shuffled;
	}

	public void setShuffled(String shuffled) {
		this.shuffled = shuffled;
	}

	public String getRemaining() {
		return remaining;
	}

	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}

	@Override
	public String toString() {
		return "ShuffleCards [success=" + success + ", deck_id=" + deck_id + ", shuffled=" + shuffled + ", remaining="
				+ remaining + "]";
	}

}

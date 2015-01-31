package hello;

public class PlayerEvent {
	private String eventString;
	private boolean goodEvent;
	private int hpChange;
	
	public PlayerEvent(String eventstr, boolean good, int hp) {
		this.eventString = eventstr;
		this.goodEvent = good;
		this.hpChange = hp;
	}
	
	public String getEventString() {
		return eventString;
	}

	public boolean isGoodEvent() {
		return goodEvent;
	}

	public int getHpChange() {
		return hpChange;
	}




	
}

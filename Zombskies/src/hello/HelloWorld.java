package hello;
import hello.PlayerEvent;
import java.util.*;


public class HelloWorld {
	private int playerID;
	private int playerHP;

	public void fartFunction() {
		this.playerID = 1;
		this.playerHP = 100;
	}
	
	public String toString() {
		return "Player " + this.playerID + "'s HP is " + this.playerHP;
	}
	public String loserString() {
		return "Player " + this.playerID + "  wins!";
	}
	
	public String playerEvent() {
		PlayerEvent[] events = {
			new PlayerEvent(" gets punched in the junk.", false, -5),
			new PlayerEvent(" farts so hard.", false, -3),
			new PlayerEvent(" holds his breath.", false, -2),
			new PlayerEvent(" drinks a beer", true, 3),
			new PlayerEvent(" kicks the bedpost.", false, -1)
		};
		Random rando = new Random();
		int randIndex = rando.nextInt(events.length);
		
		PlayerEvent randomEvent = events[randIndex];
		
		this.playerHP += randomEvent.getHpChange();
		
		return "Player " + this.playerID + randomEvent.getEventString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld hwVar = new HelloWorld();
		HelloWorld hwVar2 = new HelloWorld();
		
		hwVar.fartFunction();
		
		hwVar.playerHP = 89;
		//Setting playerHp
		hwVar2.playerID = 2;
		hwVar2.playerHP = 99;
		
		//Prints		
		for( int loopCounter = 0; loopCounter < 5; loopCounter++) {
			System.out.println(hwVar.playerEvent());
			System.out.println(hwVar.toString());
			System.out.println(hwVar2.playerEvent());
			System.out.println(hwVar2.toString());
		}
		
		if (hwVar.playerHP < hwVar2.playerHP) {
			System.out.println(hwVar2.loserString());
		} else{
			System.out.println(hwVar.loserString());
		}
		
		//PlayerID Increment Function
		
	}

}

package hello;

public class HelloWorld {
	private int playerID;
	private int playerHP;

	public void fartFunction() {
		this.playerID = 36;
		this.playerHP = 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld hwVar = new HelloWorld();
		HelloWorld hwVar2 = new HelloWorld();
		
		hwVar.fartFunction();
		
		hwVar.playerHP = 89;
		//Setting playerHp
		hwVar2.playerID = 66;
		hwVar2.playerHP = 99;
		
		//Prints		
		System.out.println("Player ID1: " + hwVar.playerID);
		System.out.println("Player HP1: " + hwVar.playerHP);
		System.out.println("Player ID2: " + hwVar2.playerID);
		System.out.println("Player HP2: " + hwVar2.playerHP);
		//PlayerID Increment Function
		
	}

}

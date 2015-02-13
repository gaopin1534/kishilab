import java.io.IOException;

public class EX4_1_Dice{
	public static void main(String args[]) throws IOException{
		System.out.println("サイコロを振ります");
		castDice();
	}
	public static void castDice(){
		int random = (int)Math.floor(Math.random()*6+1);
		System.out.println("サイコロの目は" + random + "です");
	}
}
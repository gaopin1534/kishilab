import java.io.IOException;

public class EX4_2_Dice{
	public static void main(String args[]) throws IOException{
		System.out.println("サイコロを振ります");
		dices dice1 = new dices();
		dices dice2 = new dices();
		dices dice3 = new dices();
		int my_point,his_point;
		my_point = dice1.castDice() + dice2.castDice() + dice3.castDice();
		System.out.println("あなたのサイコロを振ります->サイコロの目の合計は「"+my_point+"」です");
		his_point = dice1.castDice() + dice2.castDice() + dice3.castDice();
		System.out.println("相手のサイコロを振ります->サイコロの目の合計は「"+his_point+"」です");
	}

}
class dices{
	public int castDice(){
		int random = (int)Math.floor(Math.random()*6+1);
		return random;
	}

}
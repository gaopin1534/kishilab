import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai5_4{
	public static void main(String args[]) throws IOException{
		System.out.println("2進数にする数字を入力してください");
		BufferedReader r =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int n;
		n =  Integer.parseInt(r.readLine());
		System.out.println(change2(n));
	}
	public static String change2(int n){
		return Integer.toBinaryString(n);
	}
}
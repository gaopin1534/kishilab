import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai5_3{
	public static void main(String args[]) throws IOException{
		System.out.println("階乗する数字を入力してください");
		BufferedReader r =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int n;
		n =  Integer.parseInt(r.readLine());
		
		System.out.println(kaijo(n));
	}
	public static int kaijo(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result *= i;
		}
		return result;
	}
}
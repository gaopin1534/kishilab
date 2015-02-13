import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai5_2{
	public static void main(String args[]) throws IOException{
		System.out.println("一つ目の数字を入力してください");
		BufferedReader r =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int n;
		n =  Integer.parseInt(r.readLine());
		System.out.println("ニつ目の数字を入力してください");
		BufferedReader b =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int m;
		m =  Integer.parseInt(b.readLine());
		System.out.println(heikin(n,m));
	}
	public static int heikin(int n,int m){
		int sum = n+m;
		return sum/2;
	}
}
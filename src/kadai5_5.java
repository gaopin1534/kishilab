import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai5_5{
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
		System.out.println(kumi(n,m));
	}
	public static int kumi(int n,int m){
		int foo=1,bar=1;
		for(int i=n;i>n-m;i--){
			foo*=i;
		}
		bar = Kadai5_3.kaijo(m);
		
		return foo/bar;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai1{
	public static void main(String args[]) throws IOException{
		System.out.println("\\\\\\");
		System.out.println("数字入力よろ");
		BufferedReader r =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int i;String tmp;
		tmp = r.readLine();
		i = Integer.parseInt(tmp);
		if(i<=10){
			System.out.println("0～10");
		}else if(i>=10&&i<=20){
			System.out.println("0～20");
		}else{
			System.out.println("それ以外");
		}
		i=2;
		while(i<=10){
			System.out.println(i);
			i+=2;
		}
		String str="*";
		for(i=0;i<5;i++){
			System.out.println(str);
			str += "*";
		}
	}
}
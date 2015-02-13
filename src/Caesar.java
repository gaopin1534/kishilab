import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Caesar {
   public static void main(String[] args)throws IOException {

      String text;      //復号化する文字
      String data1 = "";        //復号化データ
      char no;         //ずらす文字数

      System.out.println("復号したい文字を入力してください");
		BufferedReader b =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		text = b.readLine();
      System.out.println("ずらす数字を入力してください");
		BufferedReader r =
	            new BufferedReader(new InputStreamReader(System.in), 1);
		int tmp;
		tmp =  Integer.parseInt(r.readLine());
		no = (char)tmp;
      //復号化(noで指定文字数プラスする)
      for(int i=0; i<text.length(); i++){
    	  //ZまでいったらAに戻る
    	  if(String.valueOf((char)(text.charAt(i) + no)).compareTo("Z") > 0 ){
    		  data1 = data1 + String.valueOf((char)(text.charAt(i) + no - 26));
    	  }else{
    		  data1 = data1 + String.valueOf((char)(text.charAt(i) + no));
    	  }
      }

         System.out.println("元のデータ：" + text);
         System.out.println("複合後：" +data1);

  }
}

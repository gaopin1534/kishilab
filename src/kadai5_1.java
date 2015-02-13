import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai5_1 {
	public static void main(String args[]) throws IOException{
		jihanki logic = new jihanki();
		logic.setType();
		while(true){
			System.out.println("行動を選択してください");
			System.out.println("現在"+logic.current+"円です");
			System.out.println("1.入金　2.購入　3.タイプ変更　4.返金(終了)");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);
			int action = Integer.parseInt(reader.readLine());
			if(action == 1){
				logic.nyukin();
			}else if(action==2){
				logic.konyu();
			}else if(action == 3){
				logic.setType();
			}else if (action == 4) {
				logic.henkin();
			}
		}
	}
}
interface hoge{

	void nyukin()throws IOException;
	void konyu() throws IOException;
	void setType() throws IOException;
	void henkin();
}

class jihanki implements hoge{
	int[][] items = {{120,140,160,200},{800,2000,2400,2600}};
	int[]  plices = {0,10,50,100,500,1000,5000,10000};
	int current_type;
	int current = 0;

	public void nyukin() throws IOException{
		System.out.println("いくら入金しますか？");
		System.out.println("1.10円　2.50円　3.100円　4.500円　5.1000円　6.5000円　7.10000");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		this.current = plices[Integer.parseInt(reader.readLine())];

	}
	public void konyu() throws IOException{
		System.out.println("購入する商品を選んでください");
		for (int i=0;i<items[current_type].length;i++){
			   System.out.print("商品"+(i+1) + ":" +items[current_type][i] + "円　");
		}
		System.out.print("\n");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int item_no = Integer.parseInt(reader.readLine());
		this.current -= items[current_type][item_no-1];
		System.out.println("商品"+item_no+"を購入しました");
	}
	public void setType() throws IOException{
		System.out.println("自販機のタイプを宣言してください");
		for (int i=0;i<items.length;i++){
			  System.out.print((i+1) + ".タイプ"+(i+1)+" ");
		}
		System.out.print("\n");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		this.current_type = Integer.parseInt(reader.readLine()) - 1;
	}
	public void henkin(){
		System.out.println("残額の"+current+"円を返金します");
		System.out.println("ありがとうございました。");
		System.exit(0);
	}

}
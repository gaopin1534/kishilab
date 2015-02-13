import java.io.IOException;

public class EX4_3 implements HelloWorld {
	public static void main(String args[]) throws IOException {
		System.out.println("Country = " + COUNTRY);
		EX4_3 obj = new EX4_3();
		obj.sayHello(5);
	}
	public void sayHello(int x){
		for (int i = 1; i <= x; i++) {
			System.out.println("Hello," + COUNTRY);
			
		}
		
	}
}

interface HelloWorld {
	String COUNTRY = "United State";
	public void sayHello(int x);

}
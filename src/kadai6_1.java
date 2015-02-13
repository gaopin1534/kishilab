import java.io.IOException;

class kadai6_1 {

	public static void main(String args[]) throws IOException {
		Dog taro = new Dog("タロ", 3, 100, 15);
		System.out.println("タロの体長は" + taro.getHeight() + "です。");
		System.out.println("タロの体重は" + taro.getWeight() + "です。");
		taro.eatfood();
		System.out.println("タロの体長は" + taro.getHeight() + "です。");
		System.out.println("タロの体重は" + taro.getWeight() + "です。");
		taro.sanpo();
		System.out.println("タロの体長は" + taro.getHeight() + "です。");
		System.out.println("タロの体重は" + taro.getWeight() + "です。");
	}
}

class Dog {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Dog(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public int getWeight(){
		return this.weight;
	}
	public int getHeight(){
		return this.height;
	}
	public void eatfood(){
		System.out.println(this.name+"は食べました。");
		this.height++;
		this.weight+=10;
	}
	public void sanpo(){
		System.out.println(this.name+"は散歩しました。");
		this.weight-=2;
	}
}
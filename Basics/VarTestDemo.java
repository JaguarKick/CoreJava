class Fruit {
	private String fruitName;
	Fruit(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String getFruitName() {
		return fruitName;
	}
}

public class VarTestDemo {
	public static void main(String args[]) {
		var fruit = new Fruit("Apple");
		System.out.println(fruit.getFruitName());
	}
}

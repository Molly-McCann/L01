
// Molly McCann & Julia Bub
// 01.23.2024

public class Main {

	public static void main(String[] args) {
		// Creating two objects of the Cup class
		Cup cup1 = new Cup("Plastic", 12);
		Cup cup2 = new Cup("Glass", 16);

		// Must "use" cup1 and cup2, otherwise there will be errors
		System.out.println(cup1.material + cup1.capacityInOunces + cup1.isFull);
		System.out.println(cup2.material + cup2.capacityInOunces + cup2.isFull);
	}

}

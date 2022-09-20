package homeTaskThree;

public class Main {
	public static void main(String[] args) {
		GenClass genClass = new GenClass();
		Dog dogRex = new Dog("Rex", "Grey");
		Cat catVasya = new Cat("Vasya", "Brown");
		genClass.animalInfo(dogRex);
		genClass.animalInfo(catVasya);
	}
}

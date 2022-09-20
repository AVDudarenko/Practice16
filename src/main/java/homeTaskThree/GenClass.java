package homeTaskThree;

public class GenClass<T extends Animal> {

	public void animalInfo(T arg) {
		System.out.println("Animal name: " + arg.getName() + " Animal color " + arg.getColor());
	}
}

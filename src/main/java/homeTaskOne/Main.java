package homeTaskOne;

public class Main {
	public static void main(String[] args) {
		GenericClass<String> genericClass = new GenericClass<>();
		Main main = new Main();

		genericClass.checkTheClass(genericClass);
		genericClass.checkTheClass(main);
		genericClass.checkTheClass(12);
	}
}

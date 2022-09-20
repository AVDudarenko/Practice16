package homeTaskThree;

public class GenConstructor {

	public <T, V> GenConstructor(T argOne, V argTwo) {
		if (argTwo.getClass().equals(argOne.getClass())) {
			System.out.println(argOne.getClass().getName() + " Equals " + argTwo.getClass().getName());
		} else {
			System.out.println(argOne.getClass().getName() + " Not Equals " + argTwo.getClass().getName());
		}
	}
}

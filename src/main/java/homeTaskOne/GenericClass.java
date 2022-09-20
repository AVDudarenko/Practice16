package homeTaskOne;

public class GenericClass<T> {
	public <T> void checkTheClass(T obj) {
		System.out.println(obj.getClass().getName());
	}
}

package homeTaskTwo;

public class OperationWithNumbers<T extends Number> {

	public void findSumOfElementsInArray(T[] array) {
		double sum = 0;
		for (T value : array) {
			sum += value.doubleValue();
		}
		System.out.println("Sum of elements in array: " + sum);
	}
}

package homeTaskTwo;

public class Main {
	public static void main(String[] args) {
		OperationWithNumbers<Integer> operationWithInt = new OperationWithNumbers<>();
		OperationWithNumbers<Double> operationWithDouble = new OperationWithNumbers<>();

		Integer[] arrayOfInt = {1, 22, 34, 56, 745, 8569, 967078, 253534};
		Double[] arrayOfDouble = {21312.312432, 214.321321, 1.2, 0.4214};

		operationWithInt.findSumOfElementsInArray(arrayOfInt);
		operationWithDouble.findSumOfElementsInArray(arrayOfDouble);

	}
}

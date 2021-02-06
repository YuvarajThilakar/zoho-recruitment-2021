
public class InverseSevenPattern {

	public static void main(String[] args) {

		int inputNumber = 5;
		int[][] patternArray = new int[inputNumber][inputNumber];
		
		formPattern(inputNumber, patternArray);

		for(int i=0; i<inputNumber; i++) {
			for(int j=0; j<inputNumber; j++) {
				System.out.print(patternArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void formPattern(int inputNumber, int[][] patternArray) {

		int helper = 0;

		for (int i = 0, j = 0; i < inputNumber && j < inputNumber; i++, j++) {

			helper = inputNumber - i;
			
			for (int k = i; k < inputNumber; k++) {
				patternArray[k][j] = helper;
			}
			
			for (int k = j; k < inputNumber; k++) {
				patternArray[i][k] = helper;
			}
		}
	}

}

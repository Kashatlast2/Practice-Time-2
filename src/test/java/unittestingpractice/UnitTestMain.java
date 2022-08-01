package unittestingpractice;

public class UnitTestMain {

	public static int division(int numOne, int numTwo) {
		int result = numOne/numTwo;
		return result;
	}

	public static boolean isEmpty(String word) {
		if(word == null || word.length() == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isEven(int number) {
		if(number %2 == 0) {
			return true;
		}else {

			return false;
		}


	}
}

package JavaFundamentals;

public class TryCatch {

	public static void main(String [] args) {
		try {
			
			int result = 15/0;
			
		}catch (Throwable ex) {
			
			System.out.println("Division by zero is not allowed");
			System.out.println(ex.getMessage());
			
		}
		
		try {
			int num1 = 5;
			int num2 = 0;
			System.out.println(num1/num2);
		}catch(Throwable ex) {
			System.out.println("Error within code");
			ex.printStackTrace();
		} finally {
			System.out.println("Thanks for using this app!");
		}
		
	}
}

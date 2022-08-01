package unittestingpractice;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnitTest {

	@Test
	public void successfulDivision(){

		int validNumOne = 6;
		int validNumTwo = 2;
		int result = UnitTestMain.division(validNumOne, validNumTwo);

		assertEquals(result, 3);
		assertNotEquals(result, 2); 

	}

	@Test
	public	void nameCheck() {
		String name = "Emma";
		assertEquals(name, "Emma");
		assertNotEquals(name, "Sophie");


	}
	@Test
	public void successfulIsEmptyTest() {
		assertTrue(UnitTestMain.isEmpty(null));
		assertTrue(UnitTestMain.isEmpty(""));

		assertFalse(UnitTestMain.isEmpty("em"));
		assertFalse(UnitTestMain.isEmpty(" "));

		assertNull(UnitTestMain.isEmpty(null));
		assertNull(UnitTestMain.isEmpty(" "));

		assertNotNull(UnitTestMain.isEmpty("em"));
		assertNotNull(UnitTestMain.isEmpty(" "));

	}
	@Test
	public void arrayEqualsExample() {

		final int[] actualArray = {3,2,1};
		final int[] expectedArray = {1,2,3};

		assertArrayEquals(expectedArray, actualArray);

	}

	@ParameterizedTest
	@ValueSource (ints = {6,4,8,16})

	public void isEvenReturnTrue(int number) {
		assertTrue(UnitTestMain.isEven(number));

	}
	@ParameterizedTest
	@ValueSource (ints = {1,3,5,7})
	public void isOddReturnFalse (int number) {
		assertFalse(UnitTestMain.isEven(number));
	}



}

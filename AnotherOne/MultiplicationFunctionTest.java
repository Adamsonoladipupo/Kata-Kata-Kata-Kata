import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationFunctionTest{

	@Test
	public void TestIfIsMultipleFunction(){
		MultiplicationFunction multiplicationFunction = new MultiplicationFunction();
		
	}

	@Test
	public void TestIfIsMultipleFunctionReturnsTheDesiredResult(){
		MultiplicationFunction multiplicationFunction = new MultiplicationFunction();
		int expected = 16;
		int actual = multiplicationFunction.isMultiply(4,4);
		assertEquals(expected, actual);
		
	}

	@Test
	public void TestIfIsMultipleFunctionReturnsTheDesiredResultWithZeroInputs(){
		MultiplicationFunction multiplicationFunction = new MultiplicationFunction();
		int expected = 0;
		int actual = multiplicationFunction.isMultiply(4,0);
		assertEquals(expected, actual);
		
	}

	@Test
	public void TestIfIsMultipleFunctionReturnsTheDesiredResultWithNegativeNumbers(){
		MultiplicationFunction multiplicationFunction = new MultiplicationFunction();
		int expected = -12;
		int actual = multiplicationFunction.isMultiply(4,-3);
		assertEquals(expected, actual);
		
	}
	
	
}
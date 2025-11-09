import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadAndAddTest{
	
	@Test
	public void TestIfReadAndAddFunctionCollectInputs(){
		ReadAndAddFunction readAndAddFunction = new ReadAndAddFunction();
		int expected = 6;
		int actual = readAndAddFunction.ReadAndAdd(123);
		assertEquals(expected, actual);
		
	}
}
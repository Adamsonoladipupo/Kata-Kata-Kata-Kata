import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class kataTest{

	// declare object
	kataFunction kataNewFunction;

	@BeforeEach
	public void setUp(){
		kataNewFunction = new kataFunction();
	}

	@Test
	public void TestingAdditionCalculator(){
		
		assertEquals(10, kataNewFunction.AdditionCalculator(4,6));
		
	}
	@Test
	public void TestingDivisionCalculator(){
		
		assertEquals(5, kataNewFunction.DivisionCalculator(10,2));
		
	}
	@Test
	public void TestingSubtractionCalculator(){
		
		assertEquals(8, kataNewFunction.SubtractionCalculator(10,2));
		
	}

}
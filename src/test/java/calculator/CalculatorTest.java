package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nationwide.calculator.Calculator;

public class CalculatorTest {
	@Test
	public void multiplicationTest() {
		Calculator calc=new Calculator();
		assertEquals("Multiply Failed", 8, calc.multiply(2,4));
		
	}
	@Test
	public void addTest() {
		Calculator calc=new Calculator();
		assertEquals("Add Failed", 15, calc.add(7,8));
		
	}

}

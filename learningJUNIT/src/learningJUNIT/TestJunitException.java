package learningJUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitException {

	String message = "Robert";
	MessageUtilException messageUtil = new MessageUtilException(message);

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}

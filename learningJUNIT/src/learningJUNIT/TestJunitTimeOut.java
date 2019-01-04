package learningJUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitTimeOut {
	String message = "Robert";
	MessageUtilTimeOut messageUtil = new MessageUtilTimeOut(message);

	@Test(timeout = 1000)
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

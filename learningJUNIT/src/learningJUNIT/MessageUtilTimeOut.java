/*
* This class prints the given message on console.
*/

package learningJUNIT;

public class MessageUtilTimeOut {

	private String message;

	// Constructor
	// @param message to be printed
	public MessageUtilTimeOut(String message) {
		this.message = message;
	}

	// prints the message
	public void printMessage() {
		System.out.println(message);
		while (true)
			;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}

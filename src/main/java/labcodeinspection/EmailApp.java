package labcodeinspection;

import java.util.Scanner;
import java.util.logging.Logger;

/**Email App class*/
public class EmailApp {
	@SuppressWarnings("PMD.CommentRequired")
	private static Logger log = Logger.getLogger(EmailApp.class.getName());
	
	private EmailApp{}

	/**Main method*/
	public static void main(String[] args) {
		@SuppressWarnings("PMD.ShortVariable")
		final Scanner sc = new Scanner(System.in);

		log.debug("Enter your first name: ");
		final String firstName = sc.nextLine();

		log.debug("Enter your last name: ");
		final String lastName = sc.nextLine();

		log.debug("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = sc.nextInt();
		sc.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}

package labcodeinspection;

import java.util.Locale;
import java.util.logging.Logger;

/**
*
*
* @author EmilioSG23
*/
public class Email {
	/**First Name*/
	private final String m_firstName;
	/**Last Name*/
	private final String m_lastName;
	/**Password*/
	private String password;
	/**Department*/
	private String department;
	/**Default Password Length*/
	private static final int defaultLength = 8;
	/**Email*/
	private String mail;
	@SuppressWarnings("PMD.CommentRequired")
	private static Logger log = Logger.getLogger(Email.class.getName());

	/**Constructor*/
	public Email(final String firstName, final String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**Show Info*/
	public void showInfo() {
		if(log.isDebugEnabled()) {
			log.debug("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
			log.debug("DEPARMENT= " + department + "\nEMAIL= " + mail + "\nPASSWORD= " + password);
		}
	}

	/**Set Department*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	/**Generate a random Password*/
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		final char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**Generate a mail*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultLength);
		this.mail = this.m_firstName.toLowerCase(Locale.getDefault()) + this.m_lastName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}

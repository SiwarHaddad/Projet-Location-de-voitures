package presentation.exceptions.client;

public class ShortPasswordException extends Exception {

	public ShortPasswordException() {
		super("Mot de passe tr�s court");
	}

}

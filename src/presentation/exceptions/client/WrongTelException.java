package presentation.exceptions.client;

public class WrongTelException extends Exception {

	public WrongTelException() {
		super("Le num�ro de t�l�phone doit etre compos� de 8 chiffres");
	}

}

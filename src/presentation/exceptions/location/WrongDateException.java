package presentation.exceptions.location;

public class WrongDateException extends Exception {

	public WrongDateException() {
		super("Date possible de location commence � partir de demain");
	}

}

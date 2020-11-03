package Exercise2;
/**
 * defining invalid name exception
 * @author Sucharitha M
 *
 */
public class InvalidNameException extends Exception{
	public InvalidNameException() {
		super();
	}
	public InvalidNameException(String msg) {
		super(msg);
	}

}

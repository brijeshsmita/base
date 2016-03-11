
public class LowBalanceException extends Exception {
	private String message;
	public LowBalanceException() {
		// TODO Auto-generated constructor stub
	}
	public LowBalanceException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "LowBalanceException [message=" + message + "]";
	}

}

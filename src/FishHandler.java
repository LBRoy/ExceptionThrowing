/**
 * <p> The purpose of this class is to show how one can use Exceptions and how to rethrow and catch rethrown exception.</p>
 * @author Braden Howard
 */
public class FishHandler {
	/**
	 * The main() method calls easterStarting() method and catches the rethrown exception.
	 * @param args (not used)
	 */
	public static void main(String[]args) {
		try {
			// Outputs that it is calling easterStarting() method
			System.out.println("Main() method is about to call easterStarting() method.");
			// Calls easterStarting() method
			easterStarting();
		} 
		// Catches rethrown Exception from easterStarting() method
		catch (Exception exception){
			// Outputs that it caught the rethrown Exception from easterStarting() method
			System.out.println("Main() method has caught the rethrown exception from easterStarting() method.");
		}
	}
	/**
	 * This method calls the easterEnding() method and rethrows the caught exception to the main() method.
	 * @throws Exception to main() for it to catch
	 */
	public static void easterStarting() throws Exception{
		try {
			// Outputs that easterStarting has been called, then calls easterEnding() method.
			System.out.println("easterStarting() method has been called, now easterStarting() method "
					+ "is about to call easterEnding() method.");
			// Calls easterEnding() method
			easterEnding();
		} 
		// Catches Exception thrown from easterEnding() method
		catch (Exception exception){
			// Outputs that it caught the Exception thrown from easterEnding and is going to rethrow it to main() method
			System.out.println("easterStarting() method caught easterEnding() methods thrown exception, rethrowing it to main() method.");
			// Rethrows exception to main() method
			throw exception;
		}
	}
	/**
	 * This method throws a new Exception to the easterStarting() method.
	 * @throws Exception to easterStarting() for it to catch
	 */
	public static void easterEnding() throws Exception{
			// Outputs that easterEnding() method has been called then throws an Exception
			System.out.println("easterEnding() method has been called, easterEnding() method is about to throw an Exception.");
			// Throws a new Exception
			throw new Exception();
	}
}


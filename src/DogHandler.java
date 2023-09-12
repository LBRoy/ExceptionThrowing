import java.io.IOException;
/**
 * <p> The purpose of this class is to show how different subclasses of superclass Exception can be caught by superclass Exception.</p>
 * @author Braden Howard
 */
public class DogHandler {
	/**
	 * This inner class creates a custom Exception called ExceptionDog that extends from Exception.
	 */
	public static class ExceptionDog extends Exception{
	}
	/**
	 * This inner class creates a custom Exception called ExceptionPuppy that extends from ExceptionDog.
	 */
	public static class ExceptionPuppy extends ExceptionDog{
	}
	/**
	 * The main method shows how one can throw custom and imported Exceptions and catch them.
	 * @param args (not used)
	 */
	public static void main(String[]args) {

		try {
			// Outputs that it is about to throw an ExceptionDog
			System.out.println("I am about to throw ExceptionDog.");
			// Throws new ExceptionDog
			throw new ExceptionDog();
		} 
		// Catches ExceptionDog by superclass Exception
		catch (Exception exceptionDog){
			// Outputs that the exception has been caught
			System.out.println("ExceptionDog has been caught by superclass Exception.");
		}
	
		try {
			// Outputs that it is about to throw an ExceptionPuppy
			System.out.println("I am about to throw ExceptionPuppy.");
			// Throws new ExceptionPuppy
			throw new ExceptionPuppy();
		} 
		// Catches ExceptionPuppy by superclass Exception
		catch (Exception exceptionPuppy){
			// Outputs that the exception has been caught
			System.out.println("ExceptionPuppy has been caught by superclass Exception.");
		}
	
		try {
			// Outputs that it is about to throw an NullPointerException
			System.out.println("I am about to throw NullPointerException.");
			// Throws new NullPointerException
			throw new NullPointerException();
		} 
		// Catches nullPointerException by superclass Exception
		catch (Exception nullPointerException){
			// Outputs that the exception has been caught
			System.out.println("NullPointerException has been caught by superclass Exception.");
		}
	
		try {
			// Outputs that it is about to throw an IOException
			System.out.println("I am about to throw IOException.");
			// Throws new IOException
			throw new IOException();
		} 
		// Catches iOException by superclass Exception
		catch (Exception iOException){
			// Outputs that the exception has been caught
			System.out.println("IOException has been caught by superclass Exception.");
		}	
	}
}


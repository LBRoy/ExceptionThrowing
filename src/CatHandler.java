/**
 * <p> The purpose of this class is to show how Exceptions can be thrown/caught.</p>
 * @author Braden Howard
 */
public class CatHandler {
	/**
	 * This inner class creates a custom Exception called ExceptionAlpha that extends from Exception.
	 */
	public static class ExceptionAlpha extends Exception {	
	}
	/**
	 * This inner class creates a custom Exception called ExceptionBeta that extends from ExceptionAlpha.
	 */
	public static class ExceptionBeta extends ExceptionAlpha {	
	}
	/**
	 * This inner class creates a custom Exception called ExceptionGrammer that extends from ExceptionBeta.
	 */
	public static class ExceptionGrammer extends ExceptionBeta {	
	}
	/**
	 * The main method shows how one can throw custom Exceptions and catch them.
	 * @param args (not used)
	 */
	public static void main(String[]args) {
		
		try {
			// Outputs that it is about to throw an ExceptionAlpha
			System.out.println("I am about to throw ExceptionAlpha.");
			// Throws ExceptionAlpha
			throw new ExceptionAlpha();
		} 
		// Catches ExceptionAlpha
		catch (ExceptionAlpha exceptionAlpha){
			// Outputs that the exception has been caught
			System.out.println("ExceptionAlpha has been caught by ExceptionAlpha.");
		}
		
		try {
			// Outputs that it is about to throw an ExceptionBeta
			System.out.println("I am about to throw ExceptionBeta.");
			// Throws ExceptionBeta(subclass of ExceptionAlpha)
			throw new ExceptionBeta();
		} 
		// Catches ExceptionBeta by ExceptionAlpha
		catch (ExceptionAlpha exceptionBeta){
			// Outputs that the exception has been caught
			System.out.println("ExceptionBeta has been caught by ExceptionAlpha.");
		}
		
		try {
			// Outputs that it is about to throw an ExceptionGrammer
			System.out.println("I am about to throw ExceptionGrammer.");
			// Throws ExceptionGrammer
			throw new ExceptionGrammer();
		} 
		// Catches ExceptionGrammer by ExceptionAlpha
		catch (ExceptionAlpha exceptionGrammer){
			// Outputs that the exception has been caught
			System.out.println("ExceptionGrammer has been caught by ExceptionAlpha.");
		}
	}
}

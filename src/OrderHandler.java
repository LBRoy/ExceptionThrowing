import java.io.IOException;
/**
 * <p> The purpose of this class is to show how the order of catches can affect the code.</p>
 * @author Braden Howard
 */
public class OrderHandler {
	/**
	 * The main method shows hows to properly throw an IOException and catch it.
	 * @param args (not used)
	 */
	public static void main(String[]args){ 
	//	try {
	//		// Outputs that it is about to throw an IOException
	//		System.out.println("I am about to throw IOException");
	//		//Throws new IOException
	//		throw new IOException();
	//	} 
	//	// Catches iOException by superclass Exception
	//	catch (Exception iOException){
	//		// Outputs its has caught the IOException superclass Exception
	//		System.out.println("I have caught IOException with superclass Exception");
	//	}
	//	/* 
	//	 * Catch will never be reached because the above Exception catch is the superclass so it will catch ALL exceptions.
	//	 * So it will cause an error if you do not put the subclass catches first. If you put the subclasses first they will catch
	//	 * what they can, if they can not catch something the superclass Exception will.
	//	 */
	//	catch (IOException iOException){
	//		// If code was reached it would output the IOException was caught with subclass IOException
	//		System.out.println("I have caught IOException with subclass IOException");
	//	}
		
		try {
			// Outputs that it is about to throw an IOException
			System.out.println("I am about to throw IOException");
			//Throws new IOException
			throw new IOException();
		}
		// Catches iOException by subclass IOException
		catch (IOException iOException){
			// Outputs it has caught the IOException with subclass IOException
			System.out.println("I have caught IOException with subclass IOException");
		}
		// Catches iOException if previous catch does not (it will in this case)
		catch (Exception iOException){
			// Outputs that it has caught the IOException with superclass Exception
			System.out.println("I have caught IOException with superclass Exception");
		}
	}
}

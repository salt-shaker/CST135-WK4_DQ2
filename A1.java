/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */

// Abstract classes can't be instantiated
public abstract class A1{
	
	// Allowed variable types in an abstract class
	public String name; // Can only be access through an inheriting class
	private String privateName; // Can only be access through an inheriting class
	protected String protectedName; // Can only be access through an inheriting class
	static String STATIC_NAME = "Static Name";
	final String FINAL_NAME = "Final Name";
	
	public A1() {
		this.setPrivateName("Private Name");
	}
	
	// Methods types allowed in an abstract class
	// Public, Protected, Final, Static, or Abstract 
	public abstract void doSomething();
	
	public static void setStaticName(String x)
	{
		STATIC_NAME = x;
	}
	
	public static void getStaticName()
	{
		System.out.println("Static Method: The static name is: " + STATIC_NAME);
	}
	
	public static void doSomethingAgain() {
		System.out.println("Doing Something agian. Direct from abstract class 1.");
	}
	
	public final void doSomethingFinal() {
		System.out.println("Doing Something final. Direct from abstract class 1.");
	}

	/**
	 * @return the privateName
	 */
	public void getPrivateName() {
		System.out.println("A_and_I request super(). Getting private name from A1. Private name is: " + this.privateName);
	}

	/**
	 * @param privateName the privateName to set
	 */
	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}

}

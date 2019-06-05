/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */
public interface I1 {
	
	// By default, variables are declared public static final in an interface
	public String I1NAME = "Interface 1";
	
	public static void getiFace1Name() {
		System.out.println("Static Method: Interface 1 name is: " + I1NAME);
	}
	
	// By defaults, methods are declared abstract in an interface
	public void iFace1();
}

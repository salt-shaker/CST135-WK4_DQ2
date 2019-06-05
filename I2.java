/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */

// Interfaces and extend other interfaces
public interface I2 extends I1 {
	
	// Variables declared in an interface are always static final
	// Both variables below declared with the same modifiers
	public String I2NAME = "Interface 2";
	public static final String I2NAME_FINAL = "Interface 2";
	
	// Methods declared in an interface are always declared abstract, unless static modifier is applied
	public static void iFace2() {
		System.out.println("Static Method: iFace2 method direct from Interface 2");
	}

}

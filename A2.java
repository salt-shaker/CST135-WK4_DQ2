/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */

// Abstract classes can extend other abstract classes
public abstract class A2 extends A1{
	
	// Constructor required to call super to use variables of abstract class A1 that are not STATIC
	public A2() {
		super();
		this.name = "Name";
		this.protectedName = "Protected Name";
	}
	
	public abstract void doSomething2();
	
}

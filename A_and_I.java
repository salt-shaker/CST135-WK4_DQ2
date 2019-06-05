/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */
public class A_and_I extends A2 implements I2{
	
	// Constructor required to call super to use variables of abstract class A2 that are not STATIC
	public A_and_I() {
		super();
	}

	@Override
	public void iFace1() {
		// TODO Auto-generated method stub
		System.out.println("A_and_I iFace1 method from Interface 1");
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("A_and_I doSomething method from abstract class 1");
	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		System.out.println("A_and_I doSomething2 method from abstract class 2");
	}
	
	// name variable of A1 is directly accessible to inheriting classes
	public void getName() {
		System.out.println("A_and_I getting name from A1, inherited from A1. Name is: " + this.name);
	}
	
	public void setName(String x) {
		this.name = x;
	}
	
	// Protected name variable of A1 is directly accessible to inheriting classes
	public void getProtectedName() {
		System.out.println("A_and_I getting protected name, inherited from A1. Protected name is: " + this.protectedName);
	}
	
	public void setProtectedName(String x) {
		this.protectedName = x;
	}
	
	// Private variable of A1 is not directly accessible to inheriting classes, must use super().
	public void getPrivateName() {
		super.getPrivateName();
	}
	
	public void setPrivateName(String x) {
		super.setPrivateName("Doug");
	}
	

}

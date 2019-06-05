/**
 * 
 */
package wk4_dq2;

/**
 * @author Sashae
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_and_I newAI = new A_and_I();

		// Access static method directly from A1 Abstract class
		A1.getStaticName();

		// Access static method directly from I1 Interface class
		I1.getiFace1Name();

		// Access static method directly from I1 Interface class
		I2.iFace2();
		
		// Methods of inheriting class A_and_I
		newAI.iFace1();
		newAI.doSomething();
		newAI.doSomething2();
		newAI.getName();
		newAI.getProtectedName();
		newAI.getPrivateName();

	}

}

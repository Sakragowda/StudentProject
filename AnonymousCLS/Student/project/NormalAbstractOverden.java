/**
 * 
 */
package Student.project;

/**
 * @author Raman
 *
 */
public class NormalAbstractOverden extends superCLS{

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		System.out.println("Normal overriden");
	}
	
    public static void main(String[]args) {
    	System.out.println("Hello");
    	NormalAbstractOverden n = new NormalAbstractOverden();
    	n.watch();
    //	superCLS s = new superCLS();
    // 	s.watch();
    }

}


package itb.rpl.ppl.tugas.ci.main;

/**
 *test
 * @author khegi
 */
public class ABB extends AB implements B{
    
    private int x;
    public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

	public ABB(int x) 
        {
		this.x = x;}
    
    @Override
    public void f(){
        System.out.println("ABB");
    }
    
    @Override
    public void v(){
    }
    
    @Override
	public String toString() {
		return "" + x;
	}

}

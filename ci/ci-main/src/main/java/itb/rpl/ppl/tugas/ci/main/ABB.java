
package itb.rpl.ppl.tugas.ci.main;

/**
 *
 * @author khegi
 */
public class ABB extends AB implements B{
    
    public ABB(){
        System.out.println("ctor-ABB");
    }
    
    @Override
    public void f(){
        System.out.println("ABB.f()");
    }
    
    @Override
    public void v(){
        System.out.println("ABB-v()");
    }

}

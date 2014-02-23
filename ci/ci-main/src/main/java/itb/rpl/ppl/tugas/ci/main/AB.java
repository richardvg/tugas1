package itb.rpl.ppl.tugas.ci.main;

/**
 *
 * @author khegi
 */
public class AB extends A implements B, C {

    public AB() {

        System.out.println("ctor-AB");
    }
    
    
    @Override
    public void f(){
        System.out.println("AB.f()");
    }
    public void v() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void g() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

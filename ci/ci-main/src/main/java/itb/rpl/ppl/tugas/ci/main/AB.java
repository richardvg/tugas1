package itb.rpl.ppl.tugas.ci.main;

/**
 *test
 * @author khegi
 */
public class AB extends A implements B, C {

    public AB() {

        System.out.println("ctor-AB");
    }
    
    
    @Override
    public void f(){
        System.out.println("AB");
    }
    public void v() 
    {
    }

    public void g()
    {
    }

}

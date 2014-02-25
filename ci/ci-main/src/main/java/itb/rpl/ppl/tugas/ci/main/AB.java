package itb.rpl.ppl.tugas.ci.main;

/**
 * Kelas AB adalah subclass dari kelas A yang mengimplemen interface B dan C
 * 
 * @author      Khegi
 * @author      Aston
 * @author      Adit
 * @since       1.0
 */
public class AB extends A implements B, C {

    /** 
     * Konstruktor dari kelas AB
     * hanya mencetak String "ctor-AB"
     *
     * 
     */
    public AB() {

        System.out.println("ctor-AB");
    }
    
    
    /** 
     * Method f dari kelas AB
     * hanya mencetak String "AB"
     *
     * 
     */
    
    @Override
    public void f(){
        System.out.println("AB");
    }
    
    /** 
     * Tidak melakukan apa-apa
     *
     * 
     */
    public void v() 
    {
    }

    /** 
     * Tidak melakukan apa-apa
     *
     * 
     */
    public void g()
    {
    }

}

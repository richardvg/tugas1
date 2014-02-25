
package itb.rpl.ppl.tugas.ci.main;

/**
 * Kelas ABB adalah subclass dari kelas AB yang mengimplemen interface B
 * 
 * @author      Khegi
 * @author      Aston
 * @author      Adit
 * @author      Richard
 * @since       1.0
 */
public class ABB extends AB implements B{
    /**
    * Atribut x bertipe int
    */
    private int x;
    
    /**
        * Konstruktor ABB menset nilai x = 0
        * dan mencetak String "ctor-ABB"
        * 
        */
    public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

    /**
        * Konstruktor ABB dengan menset nilai x
        *
        * @param x nilai yang akan diset pada atribut x
        * 
        */ 
	public ABB(int x) 
        {
		this.x = x;}
    
        /**
        * mencetak String "ABB"
        *
        * 
        */
    @Override
    public void f(){
        System.out.println("ABB");
    }
    
    /**
        * Tidak melakukan apa-apa
        *
        * 
        */
    @Override
    public void v(){
    }
    
    /**
        * Mengembalikan nilai x dalam String
        *@return nilai x dalam String
        * 
        */
    @Override
	public String toString() {
		return "" + x;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.rpl.ppl.tugas.ci.main;

import java.util.Vector;

/**
 * Kelas MainProg adalah kelas utama untuk menguji kelas-kelas lainnya
 * 
 * @author      Khegi
 * @author      Aston
 * @author      Adit
 * @author      Richard
 * @since       1.0
 */
public class MainProg implements X {

    /**
    * Method utama yang dipanggil
    * Menginisialisasi kelas ABB,P,dan Q
    * Membuat Vektor berukuran AllConst.N, mengisi vektor sesuai indeks dan mencetak ke layar
    * 
    * @param args Argument ketika method dipanggil dari cmd
    */
    
	public static void main(String[] args) {
		ABB a = new ABB();
		P p=new P();
		Q q = new Q();
		a.f();
		Vector<Integer> v = new Vector<>(Allconst.N);
		for (int i=0;i<v.capacity();i++)
                {
			v.add(i);
		}
                
		for (int i=0;i<v.capacity();i++)
                {
			System.out.println(v.get(i));
		}
	}

        /**
    * Method implementasi dari interface X
    * 
    * @return int 2
    */
        
	@Override
	public int w() {
		return 2;
	}
}

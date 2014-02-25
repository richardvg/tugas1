/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.rpl.ppl.tugas.ci.main;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class MainProg implements X {

	public static void main(String[] args) {
		int N = 10;
		ABB a = new ABB();
		P p=new P();
		Q q = new Q();
		a.f();
		Vector<Integer> v = new Vector<>(N);
		v.add(N);
		for (int i=0;i<N-1;i++)
                {
			System.out.println(i);
		}
	}

	@Override
	public int w() {
		return 2;
	}
}

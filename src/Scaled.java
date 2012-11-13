/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since November 2012
 *
 */

// Zusicherungen fehlen, sonst fertig
public class Scaled<P extends Pict> implements Pict {

	P[] pv;

	public Scaled(P[] pv) {
		//pv != null;
		this.pv = pv;
	}

	public void scale(double factor) {
		// 0.1 <= factor <= 10.0;
		for (P p : pv)
			//scale every element of pv
			p.scale(factor);
	}
}
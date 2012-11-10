
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
		this.pv = pv;
	}

	@Override
	public void scale(double factor) {
		for (P p : pv)
			p.scale(factor);
	}
}

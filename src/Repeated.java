
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Repeated<P> implements Pict {

	protected P[][] p;
	private double scale;

	public Repeated(P[][] p) {
		this.p = p;
		this.scale = 1.0;
	}

	@Override
	public String toString() {
		String temp = "";
		int w = 0;
		int h = 0;
		//p.length = hoehe
		//p[0].length = breite

		if (p.length > p[0].length) {
			w = p[0].length + (p.length - p[0].length);
		} else if (p.length < p[0].length) {
			h = p.length + (p[0].length - p.length);
		}

		if (scale <= 1.0) {
			temp += draw(h, w);
		} else {
			double x =  Math.ceil(scale * w);
			double y =  Math.ceil(scale * h);
			temp += draw((int)y, (int)x);
		}
		return temp;
	}	

	private String draw(int h, int w) {
		String temp = "";
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (p[j][i] == null) {
					temp += " ";
				} else {
					temp += p[j][i];	
				}
			}
			temp += "\n";
		}
		return temp;
	}


	@Override
	public void scale(double factor) {
		if(factor < 0.1 || factor > 10.0)
			return;
		this.scale = factor;
	}

}

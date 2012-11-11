
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

		int maxlength = 0;
		for(int i = 0; i < p.length; i++) {
			if(maxlength < p[i].length) {
				maxlength = p[i].length;
			}
		}
		P[][] temp = (P[][])new Object[p.length][maxlength];
		//TODO for schleife funzt nich
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < maxlength; j++) {
				if (p[i].length < temp[i].length && j > p[i].length-1) {
					temp[i][j] = null;
				} else {
					temp[i][j] = p[i][j];
				}
			}
		}
		
		this.p = temp;
		this.scale = 1.0;
	}

	@Override
	public String toString() {
		String temp = "";		

		if (scale <= 1.0) {
			temp += draw(p.length, p[0].length, p.length, p[0].length);
		} else {
			double x =  Math.ceil(scale * p[0].length);
			double y =  Math.ceil(scale * p.length);
			temp += draw((int)y, (int)x, p[0].length, p.length);
		}
		return temp;
	}

	private String draw(int h, int w, int initialH, int initialW) {
		String temp = "";
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j <= initialW || i <= initialH) {
					if (p[i][j] == null) {
						temp += " ";
					} else {
						temp += p[i][j];	
					}
				} else {
					if (i < initialH && j > initialW) {
						temp += p[i][j-initialW];
					} else if (i > initialH && j > initialW) {
						temp += p[i-initialH][j-initialW];
					} else {
						temp += p[i-initialH][j];
					}
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

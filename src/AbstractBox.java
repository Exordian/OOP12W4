
public abstract class AbstractBox implements Pict {
	private char inhalt;
	private char rand;
	private double hoehe;
	private double breite;
		
	protected AbstractBox (double hoehe, double breite, char rand, char inhalt) {
			this.hoehe = hoehe;
			this.breite = breite;
			this.rand = rand;
			this.inhalt = inhalt;
	}

	protected double getHoehe() {
		return hoehe;
	}


	protected void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}


	protected double getBreite() {
		return breite;
	}


	protected void setBreite(double breite) {
		this.breite = breite;
	}

	protected char getInhalt() {
		return inhalt;
	}

	protected void setInhalt(char inhalt) {
		this.inhalt = inhalt;
	}

	protected char getRand() {
		return rand;
	}

	protected void setRand(char rand) {
		this.rand = rand;
	}
	
	@Override
	public String toString() {
		// TODO tostring here, for dark/clear-box
		return null;
	}

	@Override
	public void scale(double factor) {
		if(factor < 0.1 || factor > 10.0)
			return;
		setHoehe(getHoehe()*factor);
		setBreite(getBreite()*factor);
	}
}

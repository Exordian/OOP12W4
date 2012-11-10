
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public abstract class AbstractBox implements Pict {
	private char symbol;
	private char border;
	private double height;
	private double width;
		
	protected AbstractBox (double hoehe, double breite, char border, char symbol) {
			this.height = hoehe;
			this.width = breite;
			this.border = border;
			this.symbol = symbol;
	}

	protected double getHeight() {
		return height;
	}


	protected void setHeight(double hoehe) {
		this.height = hoehe;
	}


	protected double getWidth() {
		return width;
	}


	protected void setWidth(double width) {
		this.width = width;
	}

	protected char getSymbol() {
		return symbol;
	}

	protected void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	protected char getBorder() {
		return border;
	}

	protected void setBorder(char border) {
		this.border = border;
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
		setHeight(getHeight()*factor);
		setWidth(getWidth()*factor);
	}
}

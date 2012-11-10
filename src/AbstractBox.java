
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

	protected AbstractBox (double height, double width, char border, char symbol) {
		this.height = height;
		this.width = width;
		this.border = border;
		this.symbol = symbol;
	}

	protected double getHeight() {
		return height;
	}


	protected void setHeight(double height) {
		this.height = height;
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
		// TODO toString here, for dark/clear-box
		String temp = "";
		for(int i = 0; i <= height; i++) {
			if (i != 0 || i != height) {
				for(int j = 0; j <= width; j++) {
					if (j==0 || j==width) {
						temp += border;
					} else {
						temp += symbol;
					}
				}
			} else {
				for(int j = 0; j <= width; j++) {
					temp += border;
				}
			}
		}
		return temp;
	}

	@Override
	public void scale(double factor) {
		if(factor < 0.1 || factor > 10.0)
			return;
		setHeight(getHeight()*factor);
		setWidth(getWidth()*factor);
	}
}

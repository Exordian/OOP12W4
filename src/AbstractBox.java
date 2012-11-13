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
		//height, width, border and symbol != null;
		//height, width > 0;
		this.height = height;
		this.width = width;
		this.border = border;
		this.symbol = symbol;
	}

	protected double getHeight() {
		return height;
		//returns height
	}

	protected void setHeight(double height) {
		//height > 0;
		this.height = height;
		//height has been set
	}

	protected double getWidth() {
		return width;
		//return width
	}

	protected void setWidth(double width) {
		//width > 0;
		this.width = width;
		//width has been set
	}

	protected void setSymbol(char symbol) {
		//symbol is valid
		this.symbol = symbol;
		//symbol has been set
	}

	protected void setBorder(char border) {
		//border symbol is valid
		this.border = border;
		//border has been set
	}

	@Override
	public String toString() {
		String temp = "";
		for(int i = 0; i < getHeight(); i++) {
			if (i == 0 || i == getHeight()-1) {
				for(int j = 0; j < getWidth(); j++) {
					temp += border;
				}
			} else {
				for(int j = 0; j < getWidth(); j++) {
					if (j==0 || j==getWidth()-1) {
						temp += border;
					} else {
						temp += symbol;
					}
				}
			}
			temp += "\n";
		}
		return temp;
		//returns output string
	}

	public void scale(double factor) {
		// 0.1 <= factor <= 10.0;
		if(factor < 0.1 || factor > 10.0)
			return;
		setHeight(getHeight()*factor);
		setWidth(getWidth()*factor);
		//picture has been resized
	}
}
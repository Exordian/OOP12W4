/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since November 2012
 *
 */
public class DarkBox extends AbstractBox {

	public DarkBox (int height, int width, char symbol) {
		//height, width, symbol != null;
		//height, width > 0;
		super(height, width, symbol, symbol);
		//symbol for border is same symbol as inside border
	}

	public void changeSymbol(char symbol) {
		//symbol is valid; symbol can be changed at every time
		setSymbol(symbol);
		setBorder(symbol);
		//symbol has been changed
	}

}
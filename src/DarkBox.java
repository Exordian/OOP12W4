
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class DarkBox extends AbstractBox {

	public DarkBox (int height, int width, char symbol) {
			super(height, width, symbol, symbol);
	}
		
	public void changeSymbol(char symbol) {
		setSymbol(symbol);
		setBorder(symbol);
	}
	
}

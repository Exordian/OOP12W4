
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Box extends AbstractBox {

	public Box (double height, double width, char border, char symbol) {
			super(height, width, border, symbol);
			if(border == ' ')
				throw new IllegalArgumentException("leerzeichen als randzeichen");
	}
	
}

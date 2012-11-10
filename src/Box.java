
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Box extends AbstractBox {

	public Box (double hoehe, double breite, char rand, char inhalt) {
			super(hoehe, breite, rand, inhalt);
			if(rand == ' ')
				throw new IllegalArgumentException("leerzeichen als randzeichen");
	}
	
}

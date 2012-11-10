
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class DarkBox extends AbstractBox {

	public DarkBox (int hoehe, int breite, char zeichen) {
			super(hoehe, breite, zeichen, zeichen);
	}
		
	public void aendereZeichen(char zeichen) {
		setInhalt(zeichen);
		setRand(zeichen);
	}
	
}

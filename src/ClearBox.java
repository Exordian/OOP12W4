
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class ClearBox extends Box {

	public ClearBox(int hoehe, int breite) {
		super(hoehe, breite, '*', ' ');
	}

	public double seitenVerhaeltnis(){
		return getBreite()/getHoehe();
	}
}

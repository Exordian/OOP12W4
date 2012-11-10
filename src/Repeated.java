
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Repeated<P> implements Pict {
	
	protected P[][] p;
	private double scale;
	
	public Repeated(P[][] p) {
		this.p = p;
		this.scale = 1.0;
	}
	
	@Override
	public String toString() {
		// TODO
		// Ein Aufruf von toString gibt (ohne vorherigen Aufruf von scale) die Elemente des Arrays nebeneinander und übereinander liegend zurück (genauer gesagt die Ergebnisse der Aufrufe von toString in den Elementen). Haben die Elemente unterschiedliche Höhe bzw. Breite, werden die kleineren Elemente unterhalb bzw. rechts mit Leerzeichen aufgefüllt. Ähnlich wie bei FreeBox ändern Aufrufe von scale die Größe, ohne jedoch das Array zu verändern. Ist der durch (wiederholte) Aufrufe von scale gesetzte Skalierungsfaktor kleiner 1.0, so liefert toString nur die entsprechend große linke obere Ecke. Ist der Skalierungsfaktor größer als 1.0, so wird der Text entsprechend oft neben- bzw. übereinander wiederholt.
		return null;
	}
	
	@Override
	public void scale(double factor) {
		if(factor < 0.1 || factor > 10.0)
			return;
		this.scale = factor;
	}

}

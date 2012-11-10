
/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Vorlaeufiges Klassendiagramm:
		//                     Pict
		//                       |
		//    Repeated<P>---AbstractBox---Scaled<P>
		//        |            /   \
		//    FreeBox?      Box   DarkBox
		//                   |
		//               ClearBox 
		//
		// TODO
		// FreeBox muss im Konstruktor als ERSTES super() von Repeated aufrufen, das ein Char[][] haben will, wir haben aber nur nen String 
		// Evtl AbstractBox zu etwas ändern das eine Box beschreibt die automatisch aus inhalt und rand generiert wird? 
		// 			da es sonst irreführend sein könnte, mit freebox?
		// 
		// Scaled<P> ist fertig, es fehlen toString in AbstractBox und Repeated, die anderen klassen sollten bis auf die Zusicherungen auch fertig sein
		// FreeBox muss dann noch implementiert werden, theoretisch könnte die direkt von Pict erben und Repeated<Char> intern nur nutzen, evtl sogar sinnvoller?
		//          schaut mal ob euch ne sinnvolle lösung einfällt
		
		
		// trolo
		
		System.out.println(new ClearBox(5,5) + "\n");
		System.out.println(new Box(6,8 ,'x', 'o'));

	}

}

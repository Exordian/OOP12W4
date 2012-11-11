

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
		// Klassendiagramm:
		//          ____________Pict___________
		//         /              |            \
		//    Repeated<P>    AbstractBox     Scaled<P>
		//        |             /    \
		//    FreeBox         Box  DarkBox
		//                     |
		//                  ClearBox 
		//
		// TODO
		// Zusicherungen, Tests
		
		System.out.println(new ClearBox(5,5) + "\n");
		System.out.println(new Box(6,8 ,'x', 'o'));
		
		Integer[][] a = new Integer[][]{{1,2,3,4},{5,6,7,8}};
		Repeated<Integer> r = new Repeated<Integer>(a);
		System.out.println(r + "\n");
		
		r.scale(1.5);
		System.out.println(r + "\n");
		
		r.scale(3.2);
		System.out.println(r + "\n");
		
		FreeBox f = new FreeBox("1234\n5678");
		System.out.println(f + "\n");
		f.scale(1.5);
		System.out.println(f);
	}

}

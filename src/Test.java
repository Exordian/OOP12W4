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
		//       ______Pict________
		//      /       |          \
		// Repeated<P> AbstractBox Scaled<P>
		//     |        /  \
		// FreeBox    Box DarkBox
		//    		   |
		// 			ClearBox
		//
		
		
		
		//Box
		Box box = new Box(6,8,'x','o');
		System.out.println("Box:\n"+ box);
		
		box.scale(2.5); 	//scale by factor 2.5
		System.out.println(box +"\n");
			
		//DarkBox
		DarkBox darkbox = new DarkBox(3,9,'#');
		System.out.println("DarkBox:\n" +darkbox);
		
		darkbox.changeSymbol('|');	//change symbol
		System.out.println(darkbox);
		
		darkbox.scale(5);			//scale by factor 5.0
		System.out.println(darkbox);
			
		//Repeated
		Integer[][] i = new Integer[][]{{1,2,3,4},{5,6,7,8}};
		Repeated<Integer> g = new Repeated<Integer>(i);
		System.out.println("Repeated:\n"+ g +"\n");
		
		Character[][] a = new Character[][]{{'a','b','c','d'},{'e','f','g','h'}};
		Repeated<Character> r = new Repeated<Character>(a);
		System.out.println(r +"\n");

		r.scale(1.5);		//scale by factor 1.5
		System.out.println(r +"\n");

		r.scale(3.2);		//scale by factor 3.2
		System.out.println(r +"\n");	
		
		
		//FreeBox
		FreeBox f = new FreeBox("1234\n5678");
		System.out.println("FreeBox:\n"+ f +"\n");
		
		f.scale(1.5);		//scale by factor 1.5
		System.out.println(f +"\n");
			
		//ClearBox
		System.out.println("ClearBox:\n"+ new ClearBox(5,5) + "\n");
		
		//Scaled
		Pict[] pictures = new Pict[]{new Box(7,4,'*','O'), new Box(4,5,'8','3'), new DarkBox(3,3,':'), 
									new ClearBox(4,3), new FreeBox("abcdefg\nhijkilm"), new Repeated<Integer>(new Integer[][]{{1,2,3,4},{5,6,7,8}})};
		Scaled<Pict> s = new Scaled<Pict>(pictures);
		System.out.println("Scaled:\n");
		for(Pict p : pictures)
			System.out.println(p +"\n");
		s.scale(2);		//scale by factor 2
		for(Pict p : pictures)
			System.out.println(p +"\n");
	}

}
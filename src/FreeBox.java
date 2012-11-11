import java.util.ArrayList;


/**
 * 
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700) 
 * @since November 2012
 * 
 */
public class FreeBox extends Repeated<Character> {

	public FreeBox(String content) {
		super(first(content));
	}

	@Override
	public String toString() {
		//TODO
		return null;
	}

	private static Character[][] first(String content) {
		ArrayList<String> temp = new ArrayList<String>();
		int maxlength = 0;

		for (String line : content.split("\n")) {
			temp.add(line);
			if (line.length() > maxlength) {
				maxlength = line. length();
			}
		}
		Character[][]pic = new Character[temp.size()][maxlength];
		
		int counter = 0;
		for (String line : temp) {
			for (int i = 0; i < maxlength; i++) {
				if (pic[counter][i] != null) {
					pic[counter][i] = line.charAt(i);
				} else {
					pic[counter][i] = null;
				}
			}
			counter++;
		}
		return pic;
	}

}



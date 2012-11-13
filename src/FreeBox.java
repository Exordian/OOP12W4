import java.util.ArrayList;


/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since November 2012
 *
 */
public class FreeBox extends Repeated<Character> {

	public FreeBox(String content) {
		//content != null;
		super(format(content));
	}

	private static Character[][] format(String content) {
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
				pic[counter][i] = line.charAt(i);
			}
			counter++;
		}
		return pic;
		//returns 2dimensional character array of input string
	}

}


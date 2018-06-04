/*Create an empty string and first compare your y coordinates 
 * (because the two-letter direction always starts with 'N' or 'S'). 
 * Add 'N' or 'S' only if y coordinates are not equal (because if they equal, 
 * the direction is either 'E', 'W' or 'here'). 
 * Then do the same with x coordinates. If they are not equal, 'E' or 'W' will be added to the string.
 * 
 * */
public class NewDirection {

	public static String getDirection(int x1, int x2, int y1, int y2) {
		if (x1 == x2) {
			if (y1 == y2) {
				System.out.println("Here");
				return "Here";

			} else if (y2 > y1) {
				System.out.println("N");
				return "N";
			} else if (y2 < y1) {
				System.out.println("S");
				return "S";
			}
		}
		if (x2 > x1) {
			if (y2 > y1) {
				System.out.println("NE");
				return "NE";
			} else if (y2 < y1) {
				System.out.println("SE");
				return "SE";
			} else if (y1 == y2) {
				System.out.println("E");
				return "E";
			}
		}
		if (x2 < x1) {
			if (y2 > y1) {
				System.out.println("NW");
				return "NW";
			} else if (y2 < y1) {
				System.out.println("SW");
				return "SW";
			} else if (y1 == y2) {
				System.out.println("W");
				return "W";
			}
		}
		return "ERROR";
	}

	public static void main(String[] args) {
		getDirection(1, -3, 2, 4);
		getDirection(4, 5, 2, 1);
		getDirection(0,0,0,1);
		getDirection(3,1,2,1);
		getDirection(0,2,1,1);
		getDirection(0,0,0,0);
		// System.out.println(getDirection);

	}

}

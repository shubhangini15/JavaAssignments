
public class XXNoDirectionNo {
	
	
	public static  void calculateDirection(int x1, int x2, int y1,int y2) {
		if (x1==x2 && y1==y2) {
			System.out.print("Here");
		} else if (y1 < y2) {
			System.out.print("N");
		} else if (y1 > y2) {
			System.out.print("S");
		}
			if (x2 > x1) {
			System.out.print("E");
		} else if (x2 < x1) {
			System.out.print("W");
		} 
			

	}

	public static void main(String[] args) {
		calculateDirection(1, -3, 2, 4);
		System.out.println();
		calculateDirection(4, 5, 2, 1);
		System.out.println();
		calculateDirection(0,0,0,1);
		System.out.println();
		calculateDirection(3,1,2,1);
		System.out.println();
		calculateDirection(0,2,1,1);
		System.out.println();
		calculateDirection(0,0,0,0);
	}

}
/*Direction(int x1, int x2, int y1, int y2){
this.x1 = x1;
this.x2 = x2;
this.y1 = y1;
this.y2 = y2;	
}*/
/*enum directionsName {
N,
S,
E,
W
}*/
/*int eastOrWest = (x2 > x1) ? E : W;
int northOrSouth = (y2 > y1) ? N : S;*/

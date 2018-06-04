	/* Given a set of integers how many combinations are required to arrive at a given sum */
	import java.util.*;
public class XXNoFourSumUsingArrayListNo {
		public static void main(String[] args) {
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			arrList.add(1);
			arrList.add(2);
			arrList.add(3);
			arrList.add(4);
			arrList.add(5);
			arrList.add(6);
			arrList.add(7);
			arrList.add(8);
			arrList.add(9);
			arrList.add(0);
			int digit = 10;
			int len = arrList.size();
			for(int i = 0; i < len-3; i++) {
				for(int j = i+1; j < len-2; j++) {
					for(int k = j+1; k <len-1; k++) {
						for(int l = k+1; l < len; l++) {
							int sum = arrList.get(i) + arrList.get(j) + arrList.get(k) + arrList.get(l);
							if(digit == sum) {
								ArrayList<Integer> al = new ArrayList<Integer>();
								al.add(arrList.get(i));
								al.add(arrList.get(j));
								al.add(arrList.get(k));
								al.add(arrList.get(l));
								System.out.println(al);
						        }
							}
								
						}
					}
				}
			}
		}




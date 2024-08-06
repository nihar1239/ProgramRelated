package program_array;

public class OddArrayElement {
	public static void main(String[] args) {
		int [] o= {7,8,9,5,3,4};
		for(int i=0; i<o.length; i++) {
			if(o[i]%2!=0) {
				System.out.println(o[i]);
			}
		}
}
}

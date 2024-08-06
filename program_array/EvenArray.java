package program_array;

public class EvenArray {
public static void main(String[] args) {
	int[] s= {7,8,4,3,6,9};
	for(int i=0; i<s.length; i++) {
		if(s[i]%2==0) {
			System.out.println(s[i]);
		}
	}
}
}

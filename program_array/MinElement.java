package program_array;

public class MinElement {
public static void main(String[] args) {
	int[] a= {2,5,6,7,1};
	int min=a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]<min) {
			min=a[i];
		}
		
	}
	System.out.println(min);
}
}

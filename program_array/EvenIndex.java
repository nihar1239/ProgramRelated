package program_array;

public class EvenIndex {
public static void main(String[] args) {
	int [] arr= {6,8,4,2,9,3,7,5};
	for(int i=0; i<arr.length; i++) {
		if(i%2==0) {
			System.out.println(arr[i]);
		}
	}
}
}

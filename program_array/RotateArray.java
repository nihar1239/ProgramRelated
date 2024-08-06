package program_array;

public class RotateArray {
public static void main(String[] args) {
	int []arr= {2,4,5,6}; //out{4,5,6,2}
	int x=arr[0];
	for(int i=0; i<arr.length-1; i++) {
		 arr[i]=arr[i+1];
		
	}
	arr[arr.length-1]=x;
	for(int i:arr)
	System.out.println(i);
}
}

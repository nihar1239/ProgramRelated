package program_array;

public class SumArray {
public static void main(String[] args) {
	int [] a= {3,5,6,8,9};
	int sum=0;
	for(int i=0; i<a.length; i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}

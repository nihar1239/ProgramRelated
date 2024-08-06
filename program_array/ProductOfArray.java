package program_array;

public class ProductOfArray {
public static void main(String[] args) {
	int [] a= {2,3,4};
	int mul=1;
	for(int i=0; i<a.length; i++) {
		mul=mul*a[i];
	}
	System.out.println(mul);
}
}

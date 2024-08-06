package program_array;

public class ProductOfEvenIndex {
public static void main(String[] args) {
	int [] l= {2,4,6,8,3};
	int res=0;
	int mul=1;
	for(int i=0; i<l.length; i++) {
		if(i%2==0) {
			res=l[i];
			mul=mul*res;
		}
	}
	System.out.println(mul);
}
}

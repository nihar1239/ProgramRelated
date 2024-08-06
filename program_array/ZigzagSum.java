package program_array;

public class ZigzagSum {
public static void main(String[] args) {
	int[] a= {2,4,5};
	int [] b= {3,6,7,8,9};
	int sum=0;
	int [] c=new int[a.length+b.length];
	int k=0;
	for(int i=0; i<c.length; i++) {
		if(i<a.length) 
			c[k++]=a[i];
		
		if(i<b.length) 
			c[k++]=b[i];
		
		
		}
	
		for(int m : c) {
		System.out.println(m);
	}
}
}

package program_array;

public class MoveZero {
public static void main(String[] args) {
	int [] a= {10,0,8,2,0,4,0,1}; //out{10,8,2,4,1,0,0,0}
	int []b=new int[a.length];
	int k=0;
	for(int i=0; i<a.length; i++) {
		if(a[i]!=0) {
			b[k++]=a[i];
		}
	}
	for(int p:b)
		System.out.println(p);
}
}


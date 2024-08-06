package program;

public class Reverse {
public static void main(String[] args) {
	int[]a= {4,5,8,9};
	int start=0;
	int end=a.length-1;
	
	
	while(start<end) {
		int temp=a[start];  //temp=a; Swapping two variable
		a[start]=a[end];	//a=b;
		a[end]=temp;		//b=temp;
		start++;
		end--;
	}
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
}
}

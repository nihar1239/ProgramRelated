package program3;

public class SortArray {
public static void main(String[] args) {
	int[] a= {3,5,7,1,8};
	for(int i=0; i<a.length-1; i++) {
		for(int j=i+1; j<a.length; j++){
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	 int start=0;
	 int end=a.length-1;
	 int n=5;
	 while(start<end) {
		 int mid=(start+end)/2;
		 if(a[mid]==n) {
			 System.out.println("n is present in given array");
			 break;
		 }else if(a[mid]<n) {
			 start=mid+1;
			 
		 }else {
			 end=mid;
			 
		 }
		 
	 }
}
}

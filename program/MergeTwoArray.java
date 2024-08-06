package program;


public class MergeTwoArray {
public static void main(String[] args) {
	int [] arr= {30,50,70};
	int [] arr1= {80,90,100};
	int k=0;
	int [] arr2=new int[arr.length+arr1.length];
for(int i=0; i<arr.length;i++) {
	arr2[k++]=arr[i];
}
for(int i=0; i<arr1.length;i++) {
	arr2[k++]=arr1[i];
}
for(int i=0; i<arr.length+arr1.length; i++) {
	System.out.println(arr2[i]);
}

			
}
}

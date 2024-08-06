package program;

public class PallindromeNum {
public static void main(String[] args) {
	int n=121;
	int rev=0;
	int n1=0;
	int res=n;
	while(n!=0) {
		int temp=n%10;
		rev=(rev*10)+temp;
		n=n/10;
	}
		if(res==rev) {
			System.out.println("pallindrome num");
		}
		else {
			System.out.println("not pallindrome");
		}
	
}
}

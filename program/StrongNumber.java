package program;

public class StrongNumber {
 public static void main(String[] args) {
	 int n=121;
	 int n1=n;
	 int sum=0;
	 while(n!=0) {
			int temp=n%10;
			sum=sum+factorial(temp);
			n=n/10;
		}
		if(sum==n1) {
			System.out.println("strong num");
			
		}
		else {
			System.out.println("not strong");
		}
		
	}
 public static int factorial(int n) {
	int fact=1;
	for(int i=1; i<=n; i++) {
		fact=fact*i;
	}
	return fact;
	
}
	}

package program;

public class ArmStrongNum {
public static void main(String[] args) {
	int n=153;
	int n1=n,n2=n,sum=0,count=0;
	
	while(n1!=0) {
		count++;
		n1=n1/10;
	}
	while(n2!=0) {
		int power=1;
		int temp=n2%10;
		for(int i=1; i<=count; i++) {
			power=power*temp;
		}
		sum=sum+power;
		n2=n2/10;
	}
	if(sum==n) {
		System.out.println("arm strong number");
	}
	else {
		System.out.println("not armstrong");
	}
}
}

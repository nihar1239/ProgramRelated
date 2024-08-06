package program_array;

public class Average {
public static void main(String[] args) {
	int [] p= {3,5,6,5,1,10};
	int sum=0;
	int avg=1;
	int tn=p.length;
	for(int i=0; i<p.length; i++) {
		sum=sum+p[i];
		avg=sum/tn;
	}
	System.out.println(avg);
}
}

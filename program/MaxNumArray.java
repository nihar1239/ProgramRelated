package program;

public class MaxNumArray {
public static void main(String[] args) {
	int[]p= {2,5,6,8};
	int max=0;
	for(int i=0; i<p.length;i++) {
		if(p[i]>max) {
			max=p[i];
		}
	}
	System.out.println(max);
}
}

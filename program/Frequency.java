package program;

public class Frequency {
public static void main(String[] args) {
	int []m= {5,6,9,4,5};
	for(int i=0; i<m.length; i++) {
		int count=0;
		for(int j=0; j<m.length; j++) {
			if(m[i]==m[j]) {
				count++;
			}
		}
		System.out.println("count:"+count+"of"+m[i]);
	}
}
}

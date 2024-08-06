package program;

public class OddFabonicciNum {
	public static void main(String[] args) {
		int i=1;
		int p=0;
		int q=1;
		int r=0;
			while(i<=20) { 

			System.out.println(p);
			if(p%2!=0)
			r=p+q;
			p=q;
			q=r;
			i++;
		}
	}

}


package program;

public class FabonicciExam {
	public static void main(String[] args) {

int i=1;
int m=0;
int n=1;
int o=0;
while(i<=50) {
	System.out.println(m);
	o=m+n;
	m=n;
	n=o;
	i++;
}
}
}

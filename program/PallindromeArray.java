package program;

public class PallindromeArray {
public static void main(String[] args) {
char[] c= {'a','b','c','c','b','a'};
	int start=0;
	int end=c.length-1;
	boolean flag=true;
	while(start<end) {
		if(c[start]!=c[end]) {
			flag=false;
			break;
		}
		start++;
		end--;
		
	}
	if(flag==true) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("not pallindrome");
	}
}
}

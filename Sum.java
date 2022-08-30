import java.util.*;
public class Sum {

	public static void main(String[] args) {// main method is static method
	
int i,j;
Scanner sc= new Scanner(System.in);
System.out.println("enter 1st no");
i=sc.nextInt();
System.out.println("enter 2nd no");
j= sc.nextInt();
 sumation(i,j);
	}

	public static void sumation(int i, int j) {
	
		int sum= (i+j);
System.out.println("the sum is"+sum);	}

}

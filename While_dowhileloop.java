//find out sum of positive no


import java.util.Scanner;
public class While_dowhileloop {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
       int no= sc.nextInt();



		

		do {
			sum+=no;
			System.out.println(" enter no");
			no= sc.nextInt();
		} while(no>=0);
		System.out.println("sum is"+sum);
		sc.close();// close the scanner*/
		
	}

}

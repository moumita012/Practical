import java.util.*;
public class Userdefinemethod {

	public static void main(String[] args) {
		// user input
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
//taking input user
		int num=sc.nextInt();
		//call method
		checkEvenOdd(num);
		
	}

	public static void checkEvenOdd(int num) {
		// method body
		if(num%2==0) {
			System.out.println(num+ "is even");
		}else {
				System.out.println(num+" is odd");
			}
				
		} 
		
		
	}



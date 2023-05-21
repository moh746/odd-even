import java.util.Scanner;
public class Odd {
			public static void main (String[] args) {
				Scanner f = new Scanner(System.in);
			    System.out.println("Enter a number");
             float res = f.nextInt();
			 if (res%2 == 0) {
			 	System.out.println("Your number is even");
			 } else {
             System.out.println("Your number is odd");
			 }
			}
		}
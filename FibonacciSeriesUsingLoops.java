package interfacepractice;
import java.util.Scanner;
public class FibonacciSeriesUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Enter a number to find its fibonacci series.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(firstTerm+" ");
			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}

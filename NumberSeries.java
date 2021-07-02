package interfacepractice;
import java.util.Scanner;
public class NumberSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextInt();
		float result=0;
		for(float i=1; i<=n; i++) {
			result = result + 1/i;
		}
		System.out.println(result);
	}

}

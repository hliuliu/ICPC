import java.util.*;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), p =sc.nextInt(), x =sc.nextInt();
		double m = Math.round(Math.sqrt(k*p/(double)x));
		System.out.printf("%.3f\n",m*x+k*p/m);
	}
}


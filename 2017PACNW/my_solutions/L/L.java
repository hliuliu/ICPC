import java.util.*;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), p =sc.nextInt(), x =sc.nextInt();
		int m = (int)(Math.sqrt(k*p/(double)x));
		double a1 =  (m*x+k*p/(double)m);
		m++;
		double a2 =  (m*x+k*p/(double)m);
		System.out.printf("%.3f\n",Math.min(a1,a2));
	}
}


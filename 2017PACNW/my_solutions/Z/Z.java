import java.util.*;

public class Z {

	public static int getNext(int n) {
		if (n%10<9) {
			return n+1;
		}
		return getNext(n/10)*10+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getNext(n));
	}
}


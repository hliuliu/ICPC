

import java.util.*;


public class M {
	
	static Map<Integer,Set<Integer>> G = new HashMap<>(), reachable = new HashMap<>();


	public static void bfs(int start) {
		Set<Integer> target  = reachable.get(start);
		target.add(start);
		Queue<Integer> Q = new LinkedList<>();
		Q.add(start);
		// Set<Integer> seen = new HashSet<>();
		// seen.add(start);
		while (!Q.isEmpty()) {
			start = Q.poll();
			for (int child: G.get(start)) {
				if (!target.contains(child)) {
					target.add(child);
					Q.add(child);
				}
			}
		}
	}

	public static Set<Integer> intersect(Set<Integer> A, Set<Integer> B) {
		Set<Integer> S = new HashSet<Integer> ();
		for (int a:A) {
			if (B.contains(a)) {S.add(a);}
		}
		return S;
	}

	public static boolean hasNeg(int index) {
		Set<Integer> target = reachable.get(index);
		for (int x: target) {
			if (x<0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		for (int i=1;i<=n;i++) {
			G.put(i, new HashSet<Integer>());
			G.put(-i, new HashSet<Integer>());
			reachable.put(i, new HashSet<Integer>());
			reachable.put(-i, new HashSet<Integer>());
		}
		for (int i =0;i<m;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			G.get(-a).add(b);
			G.get(-b).add(a);
			// reachable.get(-a).add(b);
			// reachable.get(-b).add(a);
		}
		int opt =3;
		for (int i =1;i<=n;i++) {
			bfs(i); bfs(-i);
			if (reachable.get(i).contains(-i) && reachable.get(-i).contains(i)) {
				opt =0;
				break;
			}
			for (int common: intersect(reachable.get(i),reachable.get(-i))) {
				if (common<0) {
					opt=1;
					break;
				}
			}
			if(opt>2) {
				if (hasNeg(i) && hasNeg(-i)) {
					opt =2;
				}
			}
		}
		System.out.println(opt>2? -1: opt);
	}
}





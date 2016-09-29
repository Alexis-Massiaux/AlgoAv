import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ExoSet {
	
	public static void afficher(Set s){
		System.out.print("{"+s.size()+"}"+" = ");
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
			if(it.hasNext()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
	}
	
	public static Set<Integer> inter(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> res = new HashSet<>();
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()){
			int n=it.next();
			if(s2.contains(n)){
				res.add(n);
			}
		}
		return res;
	}
	
	public static Set<Integer> union(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> res = new HashSet<>();
		Iterator<Integer> it1 = s1.iterator();
		Iterator<Integer> it2 = s2.iterator();
		while(it1.hasNext() || it2.hasNext()){
			if(it1.hasNext()){
				res.add(it1.next());
			}
			if(it2.hasNext()){
				res.add(it2.next());
			}
		}
		return res;
	}
	
	public static boolean isIn(Set<Integer> s1, Set<Integer> s2){
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()){
			int n=it.next();
			if(!(s2.contains(n))){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Set<Integer> ens1 = new HashSet<>();
		Set<Integer> ens2 = new HashSet<>();
		for(int i=0; i<5; i++){
			ens1.add(new Random().nextInt(10)+1);
			ens2.add(new Random().nextInt(10)+1);
		}
		afficher(ens1);
		afficher(ens2);
		afficher(inter(ens1,ens2));
		afficher(union(ens1, ens2));
		System.out.println(isIn(ens1,ens2));
	}

}

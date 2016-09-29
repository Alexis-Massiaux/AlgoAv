
public class Counter {
	
	private int comp;
	private int perm;
	
	public void incComp(){
		comp++;
	}
	
	public void incPerm(){
		perm++;
	}
	
	public void incComp(int n){
		comp=comp+n;
	}
	
	public void incPerm(int n){
		perm=perm+n;
	}
	
	public String toString(){
		return "Nb comparaison(s) : "+comp+" ; Nb permutation(s) : "+perm;
	}
	
	public void resest(){
		comp=0;
		perm=0;
	}

}

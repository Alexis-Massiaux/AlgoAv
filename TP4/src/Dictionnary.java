import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dictionnary implements BidirectionnalMap{
	
	Object k1; 
	Object k2;
	
	Map<Object, Object> map = new HashMap<>();

	@Override
	public Object getFromPrimary(Object k) {
		// TODO Auto-generated method stub
		return map.get(k);
	}

	@Override
	public Object getFromSecondary(Object k) {
		// TODO Auto-generated method stub
		Set<Object> set = map.keySet();
		Iterator<Object> it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			if(map.get(o).equals(k)){
				return o;
			}
		}
		return null;
	}

	@Override
	public void put(Object k1, Object k2) {
		// TODO Auto-generated method stub
		map.put(k1, k2);
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return map.isEmpty();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		map.clear();
		
	}

	@Override
	public void removeFromPrimary(Object k1) {
		// TODO Auto-generated method stub
		map.remove(k1);
		
	}
	
	public String toString(){
		String res="";
		Set<Object> set = map.keySet();
		Iterator<Object> it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			res=res+o+" - "+map.get(o)+"\n";
		}
		return res;
	}
	
	public static void main(String[] args){
		Dictionnary dico = new Dictionnary();
		dico.put("anywhere", "nulle part");
		System.out.println(dico.toString());
		System.out.println(dico.getFromSecondary("nulle part"));
	}

}

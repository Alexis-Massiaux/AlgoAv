import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListUtils<E>{
	
	ListUtils(){}
	
	List<Integer> genereRdmIntList(){
		int taille =1+ new Random().nextInt(30);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<taille; i++){
			list.add(i,1+(new Random().nextInt(99)));
		}
		return list;
	}
	
	void affiche(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
        	System.out.print(it.next());
        	if(it.hasNext()){
        		System.out.print(" -> ");
        	}
        }
        System.out.println();
	}
	
	void afficheInverse(List<Integer> list){
		ListIterator<Integer> it = list.listIterator(list.size());
		while(it.hasPrevious()){
			System.out.print(it.previous());
			if(it.hasPrevious()){
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}
	
	int somme(List<Integer> list){
		Iterator<Integer> it = list.iterator();
		int nbr=0;
		while(it.hasNext()){
			nbr++;
		}
		return nbr;
	}
	
	int moyenne(List<Integer> list){
		return somme(list)/list.size();
	}
	
	int max(List<Integer> list){
		int max=list.get(0);
		for(int i=0; i<list.size()-1; i++){
			if(max<list.get(i+1)){
				max=list.get(i+1);
			}
		}return max;
	}
	
	int min(List<Integer> list){
		int min=list.get(0);
		for(int i=0; i<list.size()-1; i++){
			if(min>list.get(i+1)){
				min=list.get(i+1);
			}
		}return min;
	}
	
	List<Integer> positions(List<Integer> list, int n){
		List<Integer> position = new ArrayList<>();
		Iterator<Integer> it = list.iterator();
		int i=0;
		while(it.hasNext()){
			if(it.next()==n){
				position.add(i);
			}
			i++;
		}return position;
	}
	
	List<Integer> paire(List<Integer> list){
		List<Integer> pair = new ArrayList<>();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			int num = it.next();
			if(num%2==0){
				pair.add(num);
			}
		}
		return pair;
	}
	
	boolean estTrie(List<Integer> list){
		for(int i=0; i<list.size()-1; i++){
			if(list.get(i)>list.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	List<Integer> trie(List<Integer> list){
		List<Integer> trie = new ArrayList<>();
		int size = list.size();
		for(int i=0; i<size; i++){
			trie.add(min(list));
			list.remove(list.indexOf(min(list)));
			
		}
		return trie;
	}
}

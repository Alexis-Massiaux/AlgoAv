import java.util.Random;

public class Sort {

    public static int [] generateRdmIntArray(int n, int min, int max){
    	int[] tab=new int[n];
    	for(int i=0; i<n; i++){
    		tab[i]=new Random().nextInt(max-min)+min;
    	}
		return tab;
    }
    
    public static int goodPosition(int[] tab, int positionA){
    	int i=0; 
    	while(tab[positionA]>tab[i]){
    		i++;
    	}
    	
    	return i;
    }
    
    public static void changePosition(int[] tab, int positionA){
    	for(int i=0; i<goodPosition(tab, positionA); i++){
    		swap(tab,  goodPosition(tab, positionA), positionA-(i+1));
    	}
    }


    public static void insertSort(int [] tab) {
    	for(int i=0; i<tab.length-1; i++){
    		goodPosition(tab, i);
    		changePosition(tab, i);
    	}
    }
    
    public static int smaller(int[] tab, int iBeg, int iEnd){
    	int num=iBeg;
    	for(int i=iBeg+1; i<iEnd; i++){
    		if(tab[num]>tab[i]){
    			num=i;
    		}
    	}return num;
    }

    public static void selectSort(int [] tab){
    	for(int i=0; i<tab.length-1; i++){
    		int min = smaller(tab, i, tab.length);
    		swap(tab, i, min);
    	}
    }

    public static void printArray(int [] tab){
    	for(int i=0; i<tab.length; i++){
    		System.out.println(i+". "+tab[i]);
    	}
    }

    public static void swap(int [] tab, int idx, int idx2){
    	int save = tab[idx];
    	tab[idx]=tab[idx2];
    	tab[idx2]=save;
    }

    public static void bubbleSort(int [] tab){
    	boolean poursuite= true;
    	while(poursuite){
    		poursuite=false;
    		for(int i=0; i<tab.length-1; i++){
    			if(tab[i]>tab[i+1]){
    				swap(tab, i, i+1);
    				poursuite=true; 
    			}
    		}
    	}
    }
    
    public static void main(String[] args){
    	Sort sort = new Sort();
    	int[] tab = new int[10];
    	Counter c = new Counter();
    	
    	tab=sort.generateRdmIntArray(10, 0, 100);
    	//sort.bubbleSort(tab, c);
    	
    	System.out.println(c.toString());
    	
    	c.resest();
    	//sort.selectSort(tab, c);
    	
    	System.out.println(c.toString());
    	
    	c.resest();
    	//sort.insertSort(tab, c);
    	
    	System.out.println(c.toString()); 
    }
}


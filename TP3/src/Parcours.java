import java.util.Stack;

public class Parcours {

	static Labyrinthe l;

	public static void main(String[] args){
		l=new Labyrinthe();
		Stack<Cellule> pile = new Stack<Cellule>();
		pile.push(new Cellule(0,1));
		l.poserMarque(0, 1);
		while(!(pile.empty())){
			Cellule c = pile.pop();
			l.poserMarqueRetour(c.x, c.y);
			if(!(pile.empty())){
				if(pile.peek().equals(new Cellule(l.n()-1, l.n()))){
					System.out.println("Arrivee !");
				}else{					
					if((c.x-1)>0){
						if(!(l.estMur(c.x-1, (c.y))) && !(l.estMarque((c.x-1), (c.y)))){
							l.poserMarque((c.x-1),c.y);
							pile.push(new Cellule((c.x-1),c.y));
						}
					}
					if(l.n()>(c.x+1)){
						if(!(l.estMur((c.x+1), (c.y))) && !(l.estMarque(c.x+1, (c.y)))){
							l.poserMarque((c.x+1),c.y);
							pile.push(new Cellule((c.x+1),c.y));
						}
					}
					if((c.y-1)>0){
						if(!(l.estMur((c.x), (c.y-1))) && !(l.estMarque((c.x), (c.y-1)))){
							l.poserMarque((c.x),(c.y-1));
							pile.push(new Cellule((c.x),(c.y-1)));
						}
					}
					if(l.n()>(c.y+1)){
						if(!(l.estMur((c.x), (c.y+1))) && !(l.estMarque((c.x), (c.y+1)))){
							l.poserMarque((c.x),(c.y+1));
							pile.push(new Cellule((c.x),(c.y+1)));
						}
					}
				}
			}
			
			try {
				Thread.sleep(100) ;
				}
				catch(InterruptedException e){}
		}
	}
}


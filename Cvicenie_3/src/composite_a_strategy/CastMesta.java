package composite_a_strategy;

import java.util.*;

public class CastMesta implements Cast {
	   List <Cast> casti;

	   public void pridajCast(Cast cast) {
		   this.casti.add(cast);
	   }
	   
	   public void odstranCast(Cast cast) {
		   this.casti.remove(cast);
	   }
	   public void odstranCast(int i) {
		   this.casti.remove(i);
	   }
	   public void info() {
	      //vypis informacií o èasti mesta
	      
	      //výpis informácií o všetkých èastiach a budovách tejto èasti mesta
	      for (Cast e : casti)
	         e.info();
	   }
	}
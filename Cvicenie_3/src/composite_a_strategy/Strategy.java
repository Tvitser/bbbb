package composite_a_strategy;

public class Strategy {
	   public static void main(String[] args) {
		   Sifrovac a = new Sifrovac(new SifraB());
		   
		   a.sifrujText("ahoj");
	   }
}

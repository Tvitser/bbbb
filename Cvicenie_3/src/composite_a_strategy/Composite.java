package composite_a_strategy;

public class Composite {

	public static void main(String[] args) {
		// pouitie: mesto vytvoríme ako akúko¾vek inú èas
		Cast mesto = new Cast();

		// vytvoríme a do mesta pridáme jeho èasti a budovy
		Cast c = new CastMesta();
		c.pridajCast(new Budova());
		mesto.pridaj(c);

		// vıpis všetkıch informácií o meste je jednoduchı
		mesto.info();


	}
}
 

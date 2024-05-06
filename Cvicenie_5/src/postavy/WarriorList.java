package postavy;

import java.util.*;

public class WarriorList implements ClashList {
	private List<ClashList> zlozky = new ArrayList<>();
	
	public void pridajBojovuJednotku(ClashList jednotka) {
		zlozky.add(jednotka);
	}

	public List<ClashList> vyberBojoveJednotky() {
		return zlozky;
	}
	
	public List<? extends Warrior> vyberBojovnikov() {
		List<Warrior> jednotlivci = new ArrayList<>();
		
		for (ClashList e : zlozky)
			jednotlivci.addAll(e.vyberBojovnikov());
		
		return jednotlivci;
	}
}

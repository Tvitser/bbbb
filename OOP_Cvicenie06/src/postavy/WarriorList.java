package postavy;

import java.util.*;

// Vzor Composite - rola Composite
// Oddiel bojovnikov pozostava z akychkolvek bojovych zloziek,
// t. j. dalsich bojovich oddielov alebo jednotlivych bojovnikov

public class WarriorList implements ClashList {
	private List<ClashList> zlozky = new ArrayList<>();
	
	public void pridajBojovuJednotku(ClashList jednotka) {
		zlozky.add(jednotka);
	}

	public List<ClashList> vyberBojoveJednotky() {
		return zlozky;
	}
	
	public List<Rytier> vyberBojovnikov() {		
		List<Rytier> jednotlivci = new ArrayList<>();
		
		for (ClashList e : zlozky)
			jednotlivci.addAll(e.vyberBojovnikov());
		
		return jednotlivci;
	}
}

package postavy;

import java.io.*;
import java.util.*;

public class Rytier implements Energy, Warrior, ClashList, Serializable {
	public static final long serialVersionUID = 0;

	private int energia;
	protected Sword sword;

	public Rytier(int energia) {
		nastavEnergiu(energia);
	}
	public Rytier(int energia, Sword sword) {
		nastavEnergiu(energia);
		this.sword = sword;
	}
	public Rytier() {
	}
	
	public void nastavEnergiu(int energia) {
		this.energia = energia;
	}
	public void zvysEnergiu(int energia) {
		this.energia += energia;
	}
	public void znizEnergiu(int energia) {
		this.energia -= energia;
	}
	public int zistiEnergiu() {
		return energia;
	}
	
	public int ukazMec() {
		return sword.zistiVyrobneCislo();
	}

	public Sword zistiMec() {
		return sword;
	}

	public void utoc(Obor obor) {
		sword.udri(obor, this);
		obor.odveta(this); 
	}

	// Vzor Composite - rola Leaf
	public List<Rytier> vyberBojovnikov() {
		List<Rytier> jednotlivci = new ArrayList<>();
		jednotlivci.add(this);
		return jednotlivci;
	}
}

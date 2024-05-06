package postavy;
public class Obor implements Energia {
	private boolean hladny;
	
	public boolean isHladny() {
		return hladny;
	}
	public void setHladny(boolean hladny) {
		this.hladny = hladny;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	private int energia;
	
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
	
	public void nastav(boolean hladny) {
		this.hladny = hladny;
	}
	
	public void nastav(int energia, boolean hladny) {
		this.energia = energia;
		this.hladny = hladny;
	}
	
	void odveta(Rytier rytier) {
		if (energia > rytier.zistiEnergiu())
//			rytier.energia = (int) (0.9 * rytier.energia);
			// k energii sa uz neda pristupit priamo, lebo je private
			rytier.nastavEnergiu((int) (0.9 * rytier.zistiEnergiu()));
	}
	
	public Obor (int energia) {
		nastavEnergiu(energia);
	}

}


package postavy;
import mec.*;

public class Rytier implements Energia {
	private int energia;
	
	private Mec mec;
	
	public Rytier(int energia) {
		nastavEnergiu(energia);
	}
	public Rytier(int energia, Mec mec) {
		nastavEnergiu(energia);
		this.mec = mec;
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

	public void utok(Obor obor) {
		obor.setEnergia((int) (0.9 * obor.getEnergia()));
		obor.odveta(this); // premenna this obsahuje odkaz na aktualny objekt rytiera 
	}
	
	public int ukazMec() {
		return mec.zistiVyrobneCislo();
	}
}



/*
	private int pridavnaEnergia;

	public void nastavPridavnuEnergiu(int energia) {
		this.pridavnaEnergia = energia;
	}

	public void znizEnergiu(int energia) {
		this.energia -= energia;
		if (this.energia < 0) {
			pridavnaEnergia += this.energia;
			this.energia = 0;
		}
	}
	public int zistiEnergiu() {
		return energia + pridavnaEnergia;
	}


 */


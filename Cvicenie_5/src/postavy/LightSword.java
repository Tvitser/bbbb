package postavy;

public class LightSword extends Sword {

	public LightSword(int vyrobneCislo) {
		super(vyrobneCislo);
	}

	public void udri(Obor obor, Rytier rytier) {
		if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
			obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		poslednyUder = "r-sm";
	}
	public void udri(Obor obor, StatocnyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		poslednyUder = "sr-sm";
	}
}

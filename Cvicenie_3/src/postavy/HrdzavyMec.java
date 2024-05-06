package postavy;

public class HrdzavyMec extends Mec{

	public HrdzavyMec(int VyrobneCislo) {
		super(VyrobneCislo);
	}

//	public void udriRytier(Obor obor, Rytier rytier) {
	public void udri(Obor obor, Rytier rytier) {
		if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
			obor.nastavEnergiu((int) (0.99 * obor.zistiEnergiu()));
		System.out.println("Hrdzavy_mec2");
	}
//	public void udriStatocnyRytier(Obor obor, StatocnyRytier rytier) {
	public void udri(Obor obor, StatocnyRytier rytier) {
		obor.nastavEnergiu((int) (0.95 * obor.zistiEnergiu()));
		System.out.println("Hrdzavy_mec1");
	}
	//public void udriKrepyRytier(Obor obor, StatocnyRytier rytier)
	public void udri(Obor obor, KrepyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
}

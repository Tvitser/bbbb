package postavy;

public class SvetelnyMec extends Mec {
	public SvetelnyMec(int vyrobneCislo) {
		super(vyrobneCislo);
	}

//	public void udriRytier(Obor obor, Rytier rytier) {
	public void udri(Obor obor, Rytier rytier) {
		if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
			obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("r-sm");
	}
//	public void udriStatocnyRytier(Obor obor, StatocnyRytier rytier) {
	public void udri(Obor obor, StatocnyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
	//public void udriKrepyRytier(Obor obor, StatocnyRytier rytier)
	public void udri(Obor obor, KrepyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
}

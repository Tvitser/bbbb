package postavy;

public class ZlyObor extends Obor {
	boolean hladny;
	
	void odveta(Rytier rytier) {
		if (this.isHladny())
			zjedz(rytier);
	}
	void zjedz(Rytier rytier) {
		rytier.nastavEnergiu(0);
	}
	
	public ZlyObor (int energia) {
		super(energia);
	}

}

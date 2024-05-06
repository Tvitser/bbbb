package postavy;

public class AngryObor extends Obor {
	public static final long serialVersionUID = 0;
	
	public AngryObor(int energia) {
		super(energia);
	}
	public AngryObor() {
		super();
	}	
	
	public void odveta(Rytier rytier) {
		if (zistiHladny())
			zjedz(rytier);
	}
	public void zjedz(Rytier rytier) {
		rytier.nastavEnergiu(0);
	}

}

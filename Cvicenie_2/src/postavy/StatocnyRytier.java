package postavy;
import mec.Mec;

public class StatocnyRytier extends Rytier {

	public void utok(Obor obor) {
		obor.setEnergia((int) obor.getEnergia());
		// bez odvety
	}
	
	public StatocnyRytier(int energia) {
		super(energia);
	}

	public StatocnyRytier(int energia, Mec mec) {
		super(energia, mec);
	}
}


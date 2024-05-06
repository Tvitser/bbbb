package postavy;

public class StatocnyRytier extends Rytier {
	public static final long serialVersionUID = 0;

	public StatocnyRytier(int energy) {
		super(energy);
	}
	public StatocnyRytier(int energy, Sword sword) {
		super(energy, sword);
	}
	public StatocnyRytier() {
	}

	public void utoc(Obor obor) {
		sword.udri(obor, this);
		obor.odveta(this);
	}
}

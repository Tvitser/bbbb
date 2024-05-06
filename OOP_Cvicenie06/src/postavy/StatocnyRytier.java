package postavy;

public class StatocnyRytier extends Rytier {
	public static final long serialVersionUID = 0;

	public StatocnyRytier(int energia) {
		super(energia);
	}
	public StatocnyRytier(int energia, Sword sword) {
		super(energia, sword);
	}
	public StatocnyRytier() {
	}

	public void utoc(Obor obor) {
		sword.udri(obor, this);
		obor.odveta(this);
	}
}

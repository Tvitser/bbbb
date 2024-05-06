package postavy;

public class StrasidelnyObor extends ZlyObor {
	
	public StrasidelnyObor(int energia) {
		super(energia);
	}
	
	public void zjezd(Rytier rytier) {
		super.zjedz(rytier);
		this.Zarev();
	}
	
	public void Zarev() {
		System.out.println("Som spapaný!");
	}
}

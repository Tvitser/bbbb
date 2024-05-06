package uloha1;


public class Kruh extends Elipsa {
	public Kruh(Bod c, int r) {
		super(c, c, r, r);
	}
	public void setF1(Bod b) {
		super.setF1(b);
		super.setF2(b);
	}
	public void setF2(Bod b) {
		super.setF1(b);
		super.setF2(b);
	}  
	public void setA(int d) {
		super.setA(d);
		super.setB(d);
	}
	public void setB(int d) {
		super.setA(d);
		super.setB(d);
	}
}

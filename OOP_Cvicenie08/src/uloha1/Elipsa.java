package uloha1;


public class Elipsa {
	private Bod f1;
	private Bod f2;
	private int a;
	private int b;
	
	// nekontrolujeme, ci tieto parametre skutocne predstavuju elipsu
	public Elipsa(Bod f1, Bod f2, int a, int b) {
		this.f1 = f1;
		this.f2 = f2;
		this.a = a;
		this.b = b;
	}
	public Bod getF1() {
		return f1;
	}
	public Bod getF2() {
		return f2;
	}
	public void setF1(Bod b) {
		f1.setX(b.getX());
		f1.setY(b.getY());
	}
	public void setF2(Bod b) {
		f2.setX(b.getX());
		f2.setY(b.getY());
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int d) {
		a = d;
	}
	public void setB(int d) {
		b = d;
	}
}

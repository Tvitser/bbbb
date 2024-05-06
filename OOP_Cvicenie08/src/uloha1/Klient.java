package uloha1;


public class Klient {
	public void zvacsiElipsu(Elipsa e, float m) { // m-nasobne zvacsenie elipsy
		e.setA((int) (m * e.getA())); // zvacsime polomer a
		e.setB((int) (m * e.getB())); // zvacsime polomer b
		// este by bolo potrebne prepocitat ohniska
	}
		   
	public static void main(String args[]) {
		Kruh k = new Kruh(new Bod(100, 100), 10); // majme kruh s polomerom 10
		
		new Klient().zvacsiElipsu(k, (float) 1.5); // vytvorime novu instanciu triedy Klient (referenciu na ktoru si neodkladame) a hned spustime metodu zvacsiElipsu() nad nasim kruhom
		
		System.out.println(k.getA() + " " + k.getB()); // 1,5-nasobne zvacsenie by polomer nasho kruhu malo zvacsit na 15, ale...
    }
}

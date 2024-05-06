package Clash;
import mec.*;
import postavy.*;

public class Stret {
	
	public static int zratajEnergiu(Energia... e) {
		int sum = 0;
		
		for(int i = 0; i < e.length; i++) {
			sum += e[i].zistiEnergiu();
		}
		
		return sum;
	}
	
	static void stret(Obor obor, Rytier rytier) {
		rytier.utok(obor);
	}
	
	static int zistiRozdielEnergii(Energia bytost1, Energia bytost2) {
		return bytost1.zistiEnergiu() - bytost2.zistiEnergiu();
	}

	public static void main(String[] args) {
		Obor[] o = new Obor[100];
		Rytier[] r = new Rytier[100];
		
		// toto je len inicializacia poli obrov a rytierov tak, aby sa prejavili rozne kombinacie
		for (int i = 0; i < 20; i++) {
			r[i] = new StatocnyRytier(140, new Mec(i));
			o[i] = new ZlyObor(150);
			o[i].nastav(50, true);
	
	//		o[i].zjedz(); // metoda zjedz() nie je v rozhrani triedy Obor!
			
			System.out.println(zistiRozdielEnergii(o[i], r[i]) + " " +
					zistiRozdielEnergii(r[i], o[i]) + " " +
					zistiRozdielEnergii(r[i], r[i]));
		}
	
		for (int i = 20; i < 40; i++) {
			r[i] = new Rytier(40, new Mec(i));
			o[i] = new StrasidelnyObor(20);
			//o[i].energia = 30;
		}
	
		for (int i = 40; i < 100; i++) {
			r[i] = new Rytier(40, new Mec(i));
			o[i] = new Obor(40);
			o[i].setEnergia(50);
		}
		
		for (int i = 0; i < 100; i++) {
			stret(o[i], r[i]);
			System.out.println(i + ":" + "rytier " + r[i].zistiEnergiu() +
					" / " + "obor " + o[i].zistiEnergiu() + " mec: " + r[i].ukazMec());
		}
		
		Rytier Tomas = new Rytier(10000000);
		StrasidelnyObor special = new StrasidelnyObor(50);
		special.zjezd(Tomas);
		
		System.out.println(zratajEnergiu(o[47], r[2], o[99]));
		
}
}
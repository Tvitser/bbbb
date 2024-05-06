package Clash;

import java.util.*;
import postavy.*;

import java.io.*;

public class Game implements Serializable {
	public static final long serialVersionUID = 0;

	private List<Obor> obor;
	private List<Rytier> rytier;

	transient private Iterator<Obor> iterObor;
	transient private Iterator<Rytier> iterRytier;

	transient private Obor bojujuciObor;
	transient private Rytier bojujuciRytier;

	private int pocetBojovnikov;

	transient private List<ClashFollower> sledovatelia = new ArrayList<>();

	public void pridajSledovatela(ClashFollower sledovatelStavu) {
		sledovatelia.add(sledovatelStavu);
	}
	public void upovedomSledovatelov() {
		for (ClashFollower s : sledovatelia)
			s.upovedom();
	}
	
	public int zistiPocetBojovnikov() {
		return pocetBojovnikov;
	}

	public void vytvorBojovnikov(int rytieri, int statocniRytieri, int zliObri) {
		pocetBojovnikov = rytieri + statocniRytieri;
		obor = new ArrayList<>();
		rytier = new ArrayList<>();	

		WarriorList rytierskaVyprava = new WarriorList();
		WarriorList oddielObycajnychRytierov = new WarriorList();
		WarriorList oddielStatocnychRytierov = new WarriorList();
		
		WarriorList vypravaObrov = new WarriorList();
		WarriorList oddielZlychObrov = new WarriorList();

		for (int i = 0; i < rytieri; ++i) {
			if (i % 2 == 0)
				oddielObycajnychRytierov.pridajBojovuJednotku(new Rytier(100, new LightSword(i)));
			else
				oddielObycajnychRytierov.pridajBojovuJednotku(new Rytier(100, new OcelovySword(i)));
		}	

		for (int i = rytieri; i < rytieri + statocniRytieri - 1; ++i) {
			if (i % 2 == 0)
				oddielStatocnychRytierov.pridajBojovuJednotku(new StatocnyRytier(100, new LightSword(i)));
			else
				oddielStatocnychRytierov.pridajBojovuJednotku(new StatocnyRytier(100, new OcelovySword(i)));
		}
		
		rytierskaVyprava.pridajBojovuJednotku(new StatocnyRytier(150, new LightSword(rytieri + statocniRytieri - 1)));
		rytierskaVyprava.pridajBojovuJednotku(oddielStatocnychRytierov);
		rytierskaVyprava.pridajBojovuJednotku(oddielObycajnychRytierov);
		//oddielStatocnychRytierov.pridajBojovuJednotku(oddielObycajnychRytierov);
		
		
		rytier = (List<Rytier>) rytierskaVyprava.vyberBojovnikov(); //nebezpecny downcasting
		
		for (int i = 0; i < zliObri; ++i) {
			oddielZlychObrov.pridajBojovuJednotku(new AngryObor(100));
		}
		
		for (int i = 0; i < rytieri + statocniRytieri; ++i) {
			oddielZlychObrov.pridajBojovuJednotku(new AngryObor(100));
		}
		
		vypravaObrov.pridajBojovuJednotku(oddielZlychObrov);
		
		obor = (List<Obor>) vypravaObrov.vyberBojovnikov();	//nebezpecny downcasting

		upovedomSledovatelov();
	}
	
	public void stret1na1(Rytier rytier, Obor obor) {
		rytier.utoc(obor);		
	}

	public String stret() {
		String sprava = "";
		iterObor = obor.iterator();
		iterRytier = rytier.iterator();

		for (int i = 0; i < pocetBojovnikov; ++i)
			sprava = sprava + dalsiStret1na1();
	
		upovedomSledovatelov();

		return sprava;
	}

	public String dalsiStret1na1() {
		bojujuciRytier = iterRytier.next();
		bojujuciObor = iterObor.next();
		
		stret1na1(bojujuciRytier, bojujuciObor);
		
		upovedomSledovatelov();

		return rytier.indexOf(bojujuciRytier) + ":"
			+ "rytier " + bojujuciRytier.zistiEnergiu()
			+ " / " + "obor " + bojujuciObor.zistiEnergiu()
			+ " " + bojujuciRytier.zistiMec().poslednyUder
			+ "\n";
	}


	
	public int energiaObrov() {
		return zratajEnergiu(obor);
	}

	public int energiaRytierov() {
		return zratajEnergiu(rytier);
	}
	
	public void uloz() throws ClassNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hra.out"));
		out.writeObject(this);
		out.close();
	}
	
	public void nacitaj() throws ClassNotFoundException, IOException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("hra.out"));
		Game nacitanyGame = (Game) in.readObject();
		in.close();
		
		obor = nacitanyGame.obor;
		rytier = nacitanyGame.rytier;
		
		iterObor = obor.iterator();
		iterRytier = rytier.iterator();

		upovedomSledovatelov();
	}
	
	private int zratajEnergiu(List<? extends Energia> zoznam) {
	//private int zratajEnergiu(List<Energia> zoznam) {	//list typu energia neexistuje ale ? extends energia je akykolvek list ktory extenduje energiu
		int energia = 0;
		
		for (Energia o : zoznam)
			energia += o.zistiEnergiu();
		
		return energia;
	}
}


/*
public class Stret {
	
	private Obor[] obor;
	private Rytier[] rytier;

	private int pocetBojovnikov;

	private List<SledovatelStretu> sledovatelia = new LinkedList<>();

	public void pridajSledovatela(SledovatelStretu sledovatelStavu) {
		sledovatelia.add(sledovatelStavu);
	}
	public void upovedomSledovatelov() {
		for (SledovatelStretu s : sledovatelia)
			s.upovedom();
	}
	
	public int zistiPocetBojovnikov() {
		return pocetBojovnikov;
	}

	public void vytvorBojovnikov(int rytieri, int statocniRytieri, int zliObri) {
		pocetBojovnikov = rytieri + statocniRytieri;
		obor = new Obor[pocetBojovnikov];
		rytier = new Rytier[pocetBojovnikov];

		for (int i = 0; i < rytieri; ++i){
			if (i % 2 == 0)
				rytier[i] = new Rytier(100, new SvetelnyMec(i));
			else
				rytier[i] = new Rytier(100, new OcelovyMec(i));				
		}
		
		for (int i = rytieri; i < rytieri + statocniRytieri; ++i){
			if (i % 2 == 0)
				rytier[i] = new StatocnyRytier(100, new SvetelnyMec(i));
			else
				rytier[i] = new StatocnyRytier(100, new OcelovyMec(i));				
		}
		
		for (int i = 0; i < zliObri; ++i){
			obor[i] = new ZlyObor(100);
		}
		
		for (int i = zliObri; i < rytieri + statocniRytieri; ++i){
			obor[i] = new Obor(100);
		}
		
		upovedomSledovatelov();
	}
	
	public void stret1na1(Rytier rytier, Obor obor) {
		rytier.utoc(obor);		
	}

	public String stret() {
		String sprava = "";
		
		for (int i = 0; i < rytier.length; ++i){
			stret1na1(rytier[i], obor[i]);		
			sprava = sprava + (i + 1) + ":"
							+ "rytier " + rytier[i].zistiEnergiu() + " / "
							+ "obor " + obor[i].zistiEnergiu() + " / "
							+ rytier[i].zistiMec().poslednyUder
							+ "\n";
		}
	
		upovedomSledovatelov();

		return sprava;
	}		

	public int energiaObrov() {
		int energia = 0;
		
		for (Energia o : obor)
			energia += o.zistiEnergiu();
		
		return energia;
	}

	public int energiaRytierov() {
		int energia = 0;
		
		for (Energia o : rytier)
			energia += o.zistiEnergiu();
		
		return energia;
	}
	
	private int zratajEnergiu(List<? extends Energia> zoznam) {
	//private int zratajEnergiu(List<Energia> zoznam) {	//list typu energia neexistuje ale ? extends energia je akykolvek list ktory extenduje energiu
			int energia = 0;
			
			for (Energia o : zoznam)
				energia += o.zistiEnergiu();
			
			return energia;
		}
}

*/








/*
	public int energiaObrov() {
		int energia = 0;
		
//		for (Energia o : obor)
//			energia += o.zistiEnergiu();
		for (Iterator<Obor> i = obor.iterator(); i.hasNext();)
			energia += i.next().zistiEnergiu();
		
		Iterator<Obor> i = obor.iterator();
		
		while (i.hasNext())
			energia += i.next().zistiEnergiu();
		
		return energia;
	}

*/
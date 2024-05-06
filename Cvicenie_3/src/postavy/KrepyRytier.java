package postavy;

public class KrepyRytier extends Rytier{

	public KrepyRytier(int energia) {
		super(energia);
	}
	public KrepyRytier(int energia, Mec mec) {
		super(energia, mec);
	}
	public KrepyRytier() {
	}
/*
 	// udriSvetelnymMecomStatocyRytier() 
	public void udriSvetelnymMecom(Obor obor) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
 	// udriOcelovymMecomStatocyRytier() 
	public void udriOcelovymMecom(Obor obor) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-om");
	}
*/
	//pretoze ak to dam prec, tak sa bude vyuzivat objekt triedy mec (kedze tam pouzivam this). A kedze to volam s rytiera a nie so StatocnehoRytiera tak sa k tomu bude spravat ako k rytierovi
	public void utoc(Obor obor) {
//		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
/*	
		if (mec instanceof SvetelnyMec) {
			udriSvetelnymMecom(obor);
		} else if (mec instanceof OcelovyMec) {
			udriOcelovymMecom(obor);
		} else {
		}
*/
//		mec.udriStatocnyRytier(obor, this);
		mec.udri(obor, this);

		obor.odveta(this);
	}
}

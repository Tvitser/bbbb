package postavy;

// rozhranie ako predpis spravania

public interface Energy {
	void nastavEnergiu(int energia); // standardne setEnergia(int energia)
	void zvysEnergiu(int energia);
	void znizEnergiu(int energia);
	int zistiEnergiu(); // standardne getEnergia()
}

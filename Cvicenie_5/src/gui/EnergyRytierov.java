package gui;

import javafx.scene.control.*;
import Clash.*;

public class EnergyRytierov extends TextField implements ClashFollower {
	private Game game;
	private int energia;

	public EnergyRytierov(Game game) {
		super();
		this.game = game;
	}
	
	public void upovedom() {
//		energia = 0;
		
//		for (int i = 0; i < stret.zistiPocetBojovnikov(); ++i)
//			energia += stret.zistiRytiera(i).zistiEnergiu() + stret.zistiObra(i).zistiEnergiu();

		energia = game.energiaObrov() + game.energiaRytierov();
		setText(Integer.toString(energia));
	}
}

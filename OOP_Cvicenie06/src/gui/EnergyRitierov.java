package gui;

import Clash.*;

import javafx.scene.control.*;

public class EnergyRitierov extends TextField implements ClashFollower {
	private Clash clash;
	private int energia;

	public EnergyRitierov(Clash clash) {
		super();
		this.clash = clash;
	}
	
	public void upovedom() {
		energia = clash.energiaObrov() + clash.energiaRytierov();
		setText(Integer.toString(energia));
	}
}


//Platform.runLater(() -> setText(Integer.toString(energia)));

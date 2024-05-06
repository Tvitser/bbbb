package observer;
public class M {
	   public static void main(String[] args) {
	      HumanTempSensor s = new HumanTempSensor();
	    
	      DigitalTemp d1 = new DigitalTemp(s);    
	      s.addDisplay(d1);
	      RelTemp d2 = new RelTemp(s);
	      s.addDisplay(d2);
	    
	      s.setTempDebug(37.5);
	      s.notifyDisplays();

	      d1.display(); // 37.33
	      d2.display(); // HIGH
	      d1.displayRoundDown(); // Zobrazi cele stupne zaokruhlene nadol
	      d2.translate();
	   }  
}
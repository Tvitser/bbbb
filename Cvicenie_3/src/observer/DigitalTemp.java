package observer;

class DigitalTemp implements TempDisplay {
	   private HumanTempSensor sensor;
	   private float temp;

	   public DigitalTemp(HumanTempSensor s) {
	      sensor = s;
	   }
	   public void refresh() {
	      temp = (float)sensor.readTemp();
	   }
	   public void display() { // len dve desatinné miesta
	      System.out.println(
	         Math.round(temp * 100.0) / 100.0);
	   }
	   public void displayRoundDown() {
		      System.out.println(Math.floor(temp));}
	   public void measureTemp() {
	      sensor.measureTemp();
	   }
	}

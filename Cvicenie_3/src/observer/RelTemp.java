package observer;

class RelTemp implements TempDisplay {
	   private HumanTempSensor sensor;
	   TempRange range;
	   double high = 37.0;
	   double low = 35.0;

	   public RelTemp(HumanTempSensor s) {
	      sensor = s;
	   }

	   public void refresh() {
	      double temp = sensor.readTemp();
	    
	      if (temp <= low)
	         range = TempRange.LOW;
	      else if (temp >= high)
	         range = TempRange.HIGH;
	      else
	         range = TempRange.NORMAL;
	   }

	   public void display() {
	      switch (range) {
	         case LOW:
	            System.out.println("LOW");
	            break;
	         case HIGH:
	            System.out.println("HIGH");
	            break;
	         default:
	            System.out.println("NORMAL");
	      }     
	   }
	   
	   public void translate() {
		      switch (range) {
		         case LOW:
		            System.out.println("Nízka");
		            break;
		         case HIGH:
		            System.out.println("Vysoká");
		            break;
		         default:
		            System.out.println("Normálna");
		      }     
		   }
	   public void measureTemp() {
	      sensor.measureTemp();
	   }
	}
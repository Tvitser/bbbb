package observer;

interface TempSensor { // rozhranie Element
	   void addDisplay(TempDisplay d); // pripoj pozorovateľa
	   void removeDisplay(TempDisplay d); // odpoj pozorovateľa
	   void notifyDisplays(); // pošli notifikáciu pozorovateľom
	   double readTemp();
	   public void measureTemp();
}

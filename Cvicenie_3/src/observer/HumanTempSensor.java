package observer;

// Valentino Vranić
// Objektovo-orientované programovanie 2014/15

// triedy a rozhrania majú prístup package, aby mohli byť v jednom súbore
// korektnejšie by bolo rozložiť ich do vlastných súborov a nastaviť im prístup public

import java.util.*;

class HumanTempSensor implements TempSensor {
   private List<TempDisplay> displays = new ArrayList<>();
   private double temp;
   public double refreshRate;
  
   public double readTemp() {
      return temp;
   }
   public void measureTemp() {
      // . . . zistí teplotu z fyzickej jednotky
      notifyDisplays(); // a pošle notifikáciu displejom
   }
   public void setTempDebug(double t) { temp = t; }
   public void addDisplay(TempDisplay d) {
      displays.add(d);
   }
   public void removeDisplay(TempDisplay d) { /* . . . */ }
   public void notifyDisplays() {
      for (TempDisplay dis : displays) {
         dis.refresh();
      }    
   }
}


enum TempRange { LOW, NORMAL, HIGH }
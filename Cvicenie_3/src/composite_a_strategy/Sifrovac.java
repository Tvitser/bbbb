package composite_a_strategy;

public class Sifrovac {
	   private Sifra sifra;
	   char[] textChars;
	   
	   public Sifrovac(Sifra sifra) {
	      this.sifra = sifra;
	   }
	   public void sifrujText(String text) {
		  this.textChars = text.toCharArray();
	      for(int i = 0; i < text.length(); i++) {
	    	  textChars[i] = sifra.sifruj(text.charAt(i));  
	      }	      
	      System.out.println(textChars);
	   }
	}

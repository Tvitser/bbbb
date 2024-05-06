package uloha3;


public class Delenie2 {
	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nedostatocny pocet parametrov.");
		} catch (NumberFormatException e) {
			System.out.println("Nespravny format parametrov.");  
		} catch (ArithmeticException e) {
			System.out.println("Chyba pri deleni.");  
		}
	}
}

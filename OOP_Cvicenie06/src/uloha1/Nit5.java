package uloha1;

public class Nit5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			final int n = i; // anonymne triedy maju pristup iba k finalnym premennym
			
			new Thread(/*
				anonymna trieda
			*/
			).start();
		}
	}
}

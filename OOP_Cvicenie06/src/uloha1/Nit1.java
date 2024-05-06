package uloha1;

public class Nit1 extends Thread {
	int n = 0;
	
	public Nit1(int n) {
		this.n = n;
	}
	
	public void run() {							//metoda sa musi volat run lebo prekonava metodu run z triedy Thread ktory sa spusta pri vytvoreni instancie triedy
		for (int i = 0; i < 10; i++) {
			System.out.println("T" + n + ": " + i);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			(new Nit1(i)).start();
	}
}

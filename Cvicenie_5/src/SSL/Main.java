package SSL;

public class Main {
	public static void main(String... args) {
		SLList<Integer> l = new SLList<Integer>();

		for (int i = 0; i < 10; i++)
			l.tailInsert(i);
	
		//l.print();
		
		l.deleteNext(l.getElement(0));
		
		l.print();
	}

}

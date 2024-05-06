package SSL;

public class SLList<T> {
	private SLLElement<T> head;
	private SLLElement<T> tail;

	public void tailInsert(T e) {
		SLLElement<T> sll_e = new SLLElement<T>(e);
		if (head == null) {
			head = sll_e;
			tail = head;
		}
		else {
			tail.setNext(sll_e);
			tail = sll_e;
		}
		tail.setNext(null);
	}
	
	public void print() {
		SLLElement<T> sll_e = head;

		while (sll_e != null) {
			System.out.println(sll_e);
			sll_e = sll_e.getNext();
		}
	}
	
	public SLLElement<T> getElement(int a) {
		int i;
		SLLElement<T> sll_list = head;
		
		for (i = 0; i < a; i++) {
			if (sll_list == null) {
				break;
			}
			else {
				sll_list = sll_list.getNext();
			}		
		}
		return sll_list;
	}
	
	public void deleteNext(SLLElement<T> sll_e) {
		SLLElement<T> sll_list = head;
		SLLElement<T> sll_prew = head;
		
		if (sll_e == null) {
			return;
		}
		
		while (sll_list != sll_e) {
			if (sll_list == null) {
				return;
			}
			sll_prew = sll_list;
			sll_list = sll_list.getNext();
		}
		
		if (sll_e.getNext() != null) {
			sll_e.setData(sll_e.getNext().getData());
			sll_e.setNext(sll_e.getNext().getNext());
		}
		else {
			sll_prew.setNext(null);
		}
	}
}
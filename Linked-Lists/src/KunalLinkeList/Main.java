package KunalLinkeList;

public class Main
{
	
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertInBetweenIndexes(100,0);// index should start from zero
        list.insertRec(100,5);
        list.display();
	}
	
}
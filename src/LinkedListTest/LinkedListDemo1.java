package LinkedListTest;

import java.util.LinkedList;
import java.util.ListIterator;

//LinkedList遍历字符串
public class LinkedListDemo1 {
	public static void mian(String[] args) {
		LinkedList <String> ll= new LinkedList <String>();
		ll.add("hello");
		ll.add("java");
		ll.add("world");
		ll.addFirst("welcome");
		ll.addLast("bye");
		ll.removeFirst();
		System.out.println(ll.getLast());
		ListIterator <String> lit=ll.listIterator();
		while(lit.hasNext()) {
			String s= lit.next();
			System.out.println(s);
		}
		
		
	}

}

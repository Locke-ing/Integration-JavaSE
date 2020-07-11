package LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList模拟栈数据结构的集合
public class LinkedListDemo2 {
	public static void main(String[] args) {
		//LinkedList的addFirst
		//栈结构：先进后出
		LinkedList <String>link=new LinkedList <String> ();
		
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");
		
		Iterator <String> it=link.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
	}
	
	

}

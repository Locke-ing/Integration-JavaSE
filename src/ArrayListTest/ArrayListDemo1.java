package ArrayListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//集合字符串遍历

public class ArrayListDemo1 {  
	public static void mian(String[] args) {
		List<String> l= new ArrayList<String> ();
		l.add("hello"); 
		l.add("java");
		l.add("world");
		
		ListIterator <String> lti=l.listIterator();
		//集合中添加元素
		lti.add("wonderful");
		while(lti.hasNext()) {
			System.out.println(lti.next());
		}
		
	}
}

package LinkedListTest;

import java.util.LinkedList;

//自定义栈集合

public class MyStack {
	
	private LinkedList<String> link;
	
	public MyStack() {
		link=new LinkedList<String>();
		}
	
	//添加
	public void add(Object obj ) {
		link.addFirst((String) obj);;
	}
	//获取
	public Object get() {
		return link.removeFirst();
	}
	//判断
	public boolean isEmpty() {
		return link.isEmpty();
	}
}

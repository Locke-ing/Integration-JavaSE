package ArrayListTest;

import java.util.ArrayList;
import java.util.Iterator;


//删除集合中的重复值

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> arr=new ArrayList <String> ();
		
		//添加元素
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		arr.add("hello");
		arr.add("world");
		arr.add("world");
		//方法1
		/*
		//创建新集合
		ArrayList newArr=new ArrayList ();
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			String s=(String) it.next();
			if(!newArr.contains(s)) {
				newArr.add(s);
			}			
		}
		//遍历新的集合
		for(dint x=0;x<newArr.size();x++) {
			String s=(String) newArr.get(x);
			System.out.println(s);
		}
		*/
		//方法2
		for(int x=0;x<arr.size()-1;x++) {
			for(int y=x+1;y<arr.size();y++) {
				if(arr.get(x).equals(arr.get(y))) {
					arr.remove(y);
					y--;
				}
			}
		}
		
		//遍历集合
		Iterator <String> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		

	}
}

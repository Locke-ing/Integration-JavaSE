package CollectionPractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//Collection 存储字符串并遍历字符串
/*
 * 1.创建集合对象
 * 2.创建字符串对象
 * 3.集合中添加字符串对象
 * 4.集合遍历
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//Object类——没有length方法
		Collection <String> c =new ArrayList<String>();
		//添加元素
		c.add("hello");
		c.add("java");
		c.add("world"); //向上转型 ： 字符串类型类型转换为对象类型
		//删除功能
		System.out.println(c.remove("hello"));
		//包含
		System.out.println(c.contains("hello"));
		//清除
		//c.clear();
		//集合是否为空
		System.out.println(c.isEmpty());

		//遍历集合：通过将集合转换为数组的形式，进行遍历
		Object[] obj= c.toArray();
		for(int x=0;x<obj.length;x++) {
			String s=(String) obj[x];  //向下转型： 对象类型转换为字符串类型
			System.out.println(s+"-------"+s.length());
		}
		//迭代器遍历集合
		Iterator<String> it=c.iterator();
		while(it.hasNext()) { //通过迭代器判断是否有对象
			String s= it.next();//通过迭代器获取对象
			System.out.println(s);
		}
	}

}

package SetTest;

import java.util.TreeSet;

/*TreeSet的特点：对元素进行排序(自然排序/比较器排序)
 * 特点：排序+唯一  
 * TreeSet源码分析：TreeSet的add()方法，再看TreeMap的put方法
 * 
 */

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();

		ts.add(10);
		ts.add(30);
		ts.add(10);
		ts.add(9);
		ts.add(11);
		ts.add(26);//自动装箱
		
		
		for(Integer s: ts) {
			System.out.println(s);
		}
	}
	


}

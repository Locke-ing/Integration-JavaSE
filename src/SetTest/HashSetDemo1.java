package SetTest;

import java.util.HashSet;

import ArrayListTest.Student;

//Set如何保证唯一性，查询源码
/*
 *通过查看add方法的源码，此方法底层有两个方法：hashCode()和equals()
 *首先比较哈希值，再用equals
 * 如果没有类重写这两个方法，默认使用Object(),一般都不相同，因为创建对象new时，都会认为他们的哈希值不同
 *而String类重写hashCode和equals方法，就会把内容相同的字符串去掉，只留下一个
 */

//自定义类对象,并保证元素唯一性
public class HashSetDemo1 {
	public static void main(String[] args) {
		//创建对象
		HashSet <Student> hs=new HashSet <Student> ();
		
		//创建学生对象
		Student s1=new Student("孙悟空",100);
		Student s2=new Student("猪八戒",90);
		Student s3=new Student("唐僧",80);
		Student s4=new Student("沙僧",70);
		Student s5=new Student("沙僧",70);
		
		//将对象添加入集合
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		//遍历集合
		for(Student s:hs) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	
		//结果显示4个对象
	}
	
}

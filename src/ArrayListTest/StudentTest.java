package ArrayListTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//遍历自定义集合

public class StudentTest {
	public static void main(String[] args) {
		//创建集合对象
		Collection <Student> c=new ArrayList<Student>();
		
		//创建学生对象
		Student s1=new Student("孙悟空",100);
		Student s2=new Student("猪八戒",90);
		Student s3=new Student("唐僧",80);
		Student s4=new Student("沙僧",70);
		
		//把学生对象添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		//遍历
		Iterator <Student> it=c.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}

		
	}
	

}

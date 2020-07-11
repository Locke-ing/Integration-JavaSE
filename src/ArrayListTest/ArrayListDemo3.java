package ArrayListTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//删除集合中自定义对象的重复值

public class ArrayListDemo3 { 
	public static void main(String[] args) {
		//创建集合对象
		Collection <Student> c=new ArrayList<Student>();
		
		//创建学生对象
		Student s1=new Student("孙悟空",100);
		Student s5=new Student("孙悟空",100);
		Student s2=new Student("猪八戒",90);
		Student s3=new Student("唐僧",80);
		Student s4=new Student("沙僧",70);
		
		//把学生对象添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//创建新集合
				ArrayList <Student> newArr=new ArrayList <Student>();
				Iterator <Student> it=c.iterator();
				while(it.hasNext()) {
					Student s= it.next();
					if(!newArr.contains(s)) {
						//contains底层默认的是equals方法，但student没有equals方法，
						//所以默认父类Object的equals方法,Object的方法比较的是地址值,new的每个对象地址值不相同
						//Student重写父类equals方法
					}
						newArr.add(s);
				}		
				//遍历新的集合
				for(int x=0;x<newArr.size();x++) {
					Student s= newArr.get(x);
					System.out.println(s.getName()+"----"+s.getAge());
				}	

        }
} 

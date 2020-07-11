package SetTest;

import java.util.HashSet;
import java.util.Set;

/*Set集合的练习
 * List:有序（存储顺序和取出顺序一致）、重复
 * Set:无序，唯一
 */

public class SetDemo1 {
	public static void main(String[] args) {
		//创建集合对象
		Set <String> set =new HashSet<String>();
		//创建并添加对象
		set.add("hello"); 
		set.add("java");
		set.add("world");	
		set.add("world");	
		
		//遍历集合
		for(String s:set) {
			System.out.println(s);
		}
	}
	/*java
	 * world
	 * hello
	 */

}

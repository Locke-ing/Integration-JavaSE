package SetTest;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet是HashSet子类——特殊的HashSet
 * 底层数据结构是哈希表和链表
 * 哈希表保证元素唯一性
 * 链表保证元素有序(存储和取出一致)
 * 
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
				LinkedHashSet <String> lhs =new LinkedHashSet<String>();
				//创建并添加对象
				lhs.add("hello"); 
				lhs.add("java");
				lhs.add("world");	
				lhs.add("world");	
				
				//遍历集合
				for(String hs:lhs) {
					System.out.println(hs);
				}
			}
	}
	

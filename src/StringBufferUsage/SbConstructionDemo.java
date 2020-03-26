package StringBufferUsage;
/* 
 * Subject:  StringBuffer构造方法
 * 
 * StringBuffer：线程安全的可变字符串
 * StringBuilder:线程不安全的可变字符串
 * 
 * StringBuffer的构造方法
 * public StringBuffer(){...} 无参构造---常用
 * public StringBuffer(int capacity){...} 指定容量
 * public StringBuffer(String str){...}  指定字符串
 * 
 * StringBuffer的方法
 * int capacity();返回当前容量
 * int length(); 返回字符串的长度
 */
public class SbConstructionDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1:"+sb1.capacity()+"  "+sb1.length());//默认值：capacity=16
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:"+sb2.capacity()+"  "+sb2.length());

		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:"+sb3.capacity()+"  "+sb3.length());//capacity=str.length+16;
	}
		
}

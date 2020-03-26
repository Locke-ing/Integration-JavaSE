package StringBufferTest;

import java.util.Scanner;

/*
 * Subject:  把字符串反转
 */

public class ReverseStringTest {
	public static void main(String[] args) {
		//键盘输入数据
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine(); //得到字符串数据
		
        //方式1：用String做拼接反转
		String s1=myReverse1(s);
		System.out.println(s1);
		
        //方式2：用StringBuffer的reverse方法反转
		String s2=myReverse1(s);
		System.out.println(s2);
	}
	
	//用String
	public static String myReverse1(String s) {
		String result = " ";//设置初值
		char[] chs = s.toCharArray(); //toCharArray()---把字符串转化为字符串数组类型
		for(int i = chs.length-1;i >= 0;i--) {
			//char ch = chs[i];
			//result += ch;
			result += chs[i];
		}
		return result;
		
	}
	
	//用StringBuffer
	public static String myReverse2(String s) {
		//StringBuffer sb = new StringBuffer(s);
		//sb.reverse();
		//return sb.toString();
		
		//简易版
		return new StringBuffer(s).reverse().toString();
	}
}

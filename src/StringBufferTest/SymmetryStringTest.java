package StringBufferTest;

import java.util.Scanner;
/*
 * Subject: 判断字符串是否对称
 *  例如：abc不是；aba是
 *  分析：方法1：判断是否对称：第一个&最后一个；第二个和倒数第二个.... 比较次数为长度除以2
 *             方法2：反转后的字符串和原字符串相同，则此字符串对称           
 */
public class SymmetryStringTest {
	public static void main(String[] args) {
		//创建录入对象
		System.out.println("请输入：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//方法2：一个一个比较
		System.out.println(isSymmetry1(s));
		
		//方法2：字符串反转
		System.out.println(isSymmetry2(s));
	}
	public static boolean isSymmetry1(String s) {
		//把字符转换为字符数组
		char[] chs = s.toCharArray();
		
		for(int start = 0,end = chs.length-1; start <= end; start++,end--) {
			if(chs[start] != chs[end]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSymmetry2(String s) { 
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}

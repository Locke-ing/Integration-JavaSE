package StringBufferUsage;
/*
 * Subject:  String与StringBuffer相互转换
 */
public class MethodDemo {
	public static void main(String[] args) {
//String--->StringBuffer
		
		 String s = "hello"; //不能把字符串的值直接赋给StringBuffer
		 
		 //方式1：通过构造方法
		 StringBuffer sb1 = new StringBuffer(s);
		 System.out.println("s1:"+sb1);
		 
		 //方式2：append()方法
		 StringBuffer sb2 = new StringBuffer();
		 System.out.println("s2:"+sb2.append(s));
		 
//StringBuffer--->String
		 
		 StringBuffer sb3 = new StringBuffer("java");
		 
		 //方式1：通过构造方法
		 String str1 = new String(sb3);
		 System.out.println("str1:"+str1);
		 
		 //方式2：通过toString()方法
		 String str2 = sb3.toString();
		 System.out.println("str2:"+str2);

	}

}

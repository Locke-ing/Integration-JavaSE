package StringBufferUsage;
/*
 * Subject:  StringBuffer的成员方法
 * 
 * StringBuffer添加功能
 * public StringBuffer append(String str);任意类型数据添加至字符串缓冲区，并返回字符串缓冲区本身
 * public StringBuffer insert(int offset,String str);在指定位置插入字符串
 *
 *StringBuffer删除功能
 * public StringBuffer delete(int start,int end);
 * public StringBuffer deleteCharAt(int index);
 *
 *StringBuffer替换功能
 * public  StringBuffer replace(int start,int end,String str);
 * 
 * StringBuffer反转功能
 * public StringBuffer reverse();
 * 
 * StringBuffer截取功能
 * public String substring(int start,int end);
 */

public class SbMethodDemo {
	public static void main(String[] args) {
		//创建字符串缓冲对象
		StringBuffer sb = new StringBuffer();
//添加功能		
		sb.append("how");
		sb.append("are");
		//链式编程
		sb.append("you").append(20);
		System.out.println("sb(1):"+sb);	
		
		//插入字符串
		sb.insert(3, "old");
		System.out.println("sb(2):"+sb);
		
//删除功能
		sb.delete(1, 3);  //start<=index<end
		System.out.println("sb(3):"+sb);
		
		sb.deleteCharAt(0);  //删除指定下标的字符
		System.out.println("sb(4):"+sb);
		
//替换功能
		sb.replace(0, 3, "How");//start<=index<end
		System.out.println("sb(5):"+sb);

//反转功能
		sb.reverse();
		System.out.println("sb(6):"+sb);
		
//截取功能
		String s1 = sb.substring(2);//截去前2个字符
		String s2 = sb.substring(0, 2);//截取后不影响原字符串
		System.out.println("sb(7):"+s1+" "+s2);
		System.out.println("sb(8):"+sb);
	}

}

package StringBufferTest;
/*
 * Subject: 把数组拼接成字符串
 * 
 */
public class ArrayToStringTest {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {23,44,55,22,21};
		
		//定义功能
		String s = arrayToString(arr);
		System.out.println(s);
		
	}
	
	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0;i<arr.length;i++) {
		//sb.append(arr[i]).append(",");
		if(i == arr.length-1) { //最后一个元素
			sb.append(arr[i]);
		}else {
			sb.append(arr[i]).append(",");
		}
	}
		sb.append("]");
		return sb.toString();//StringBuffer--->String
  }
}

package LinkedListTest;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack  ms=new MyStack();
		
		ms.add("hello");
		ms.add("java");
		ms.add("world");
		
		while(!ms.isEmpty()) {
			System.out.println(ms.get());
		}
	}

}

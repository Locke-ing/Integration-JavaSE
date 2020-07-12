package BinaryHeap;

import java.util.Comparator;

import printer.BinaryTrees;

public class Main {
	static void Test1() {//二叉堆的功能检测
		BinaryHeap<Integer> heap = new BinaryHeap<>();
		heap.add(18);
		heap.add(23);
		heap.add(24);
		heap.add(54);
		BinaryTrees.println(heap);
		
		heap.remove();
		BinaryTrees.println(heap);
		
		System.out.println(heap.replace(30));
		BinaryTrees.println(heap);
	}
	
	static void Test2() {//批量建堆
		Integer[] data = {11,3,34,25,43,24,45,56,33,56,78};
		BinaryHeap<Integer> heap = new BinaryHeap<>(data);
		BinaryTrees.println(heap);
	}
	
	static void Test3() {
		//最小堆中找出k个最大的
		BinaryHeap<Integer> heap = new BinaryHeap<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		int k = 3;
		Integer[] data = {11,3,34,25,43,24,45,56,33,56,78};
		for(int i = 0;i < data.length;i++) {
			if(heap.size() < k) {
				heap.add(data[i]);
			}else if(data[i] > heap.get()) {//当前数比堆顶的数大
				heap.replace(data[i]);
			}
		}
		
		BinaryTrees.println(heap);
		
	}
	
	public static void main(String[] args) {
		Test1();
		Test2();
		Test3();
	}
}

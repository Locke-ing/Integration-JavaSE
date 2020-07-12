package BinaryHeap;

import java.util.Comparator;

import printer.BinaryTreeInfo;

public class BinaryHeap<E> extends AbstractHeap<E> implements BinaryTreeInfo {
	
	private E[] elements;
	private static final int DEFAULT_CAPACITY=10;
	
	@SuppressWarnings("unchecked")
	public BinaryHeap(E[] elements,Comparator<E> comparator) {
		super(comparator);
		if(elements == null || elements.length == 0) {
			this.elements = (E[]) new Object[DEFAULT_CAPACITY];
		}else {//把数据复制过来
			size = elements.length;
			int capacity = Math.max(elements.length,DEFAULT_CAPACITY);
			this.elements = (E[]) new Object[capacity];
			for(int i = 0;i < elements.length;i++){
			    this.elements[i] = elements[i];
			     }
			heapify();
		}
		
	}
	public BinaryHeap(E[] elements) {
		this(elements,null);
	}
	public BinaryHeap(Comparator<E> comparator) {
		this(null,comparator);
	}
	public BinaryHeap(){
		this(null,null);
	}
	
	@Override
	public void clear() {
		for(int i = 0;i< size;i++) {
			elements[i]=null;
		}
		size = 0;
	}

	@Override
	public void add(E element) {
		elementNotNullCheck(element);
		ensureCapacity(size+1);
		elements[size++] = element;
		siftUp(size-1);
	}

	@Override
	public E get() {
		emptyCheck();
		return elements[0];
	}

	@Override
	public E remove() {
		emptyCheck();
		E root = elements[0];
		elements[0] = elements[size-1];
		elements[size-1] = null;
		size--;
		siftDown(0);
		return root;
	}

	@Override
	public E replace(E element) {//删除堆顶元素的同时插入一个元素(返回的是变化后的根节点)
		elementNotNullCheck(element);
		E root = null;
		if(size == 0) {
			elements[0] = element;
			size++;
			}else {
				root = elements[0];
				elements[0] = element;
				siftDown(0);
				
			}
		
		return root;
	}
	
	private void siftUp(int index) {
		E element = elements[index];
		while(index > 0) {//有父节点
			int parentIndex = (index-1) >> 1; //(index-1)/2
			E parent = elements[parentIndex];
			if(compare(parent, element)>= 0) break;
			elements[index] = parent;
			index =parentIndex;
		}
		elements[index] = element;
	}
	private void siftDown(int index) {
		E element = elements[index];
		int half =  size >> 1;  //非叶子结点=size/2
		//第一个叶子结点的下标就是非叶子结点的数量
		while(index < half) {//必须保证index位置是非叶子结点
			//1、index的结点有左右子节点
			//2、index的结点有一个只有左节点
			
			//默认左子结点和它进行比较
			int childIndex = (index << 1) + 1;
			E child = elements[childIndex];
			
			//右子结点
			int rightIndex = childIndex + 1;
			//选出左右最大的结点
			if(rightIndex < size && compare(elements[rightIndex],child) > 0) {
				//childIndex = rightIndex;child = elements[rightIndex];
				child = elements[childIndex = rightIndex];
			}
			
			if(compare(element, child) >= 0) break;
			
			//将子节点存放到index位置
			elements[index] = child;
			//重新设置index
			index = childIndex;
		}
		elements[index] = element;
	}
	//批量建堆
	private void heapify() {
		for(int index = (size >> 1)-1;index >=  0;index--){
		     siftDown(index);
		     }
	}
	private void ensureCapacity(int capacity) {//扩容
		int oldCapacity = elements.length;
		if(oldCapacity >= capacity) return;
		
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		@SuppressWarnings("unchecked")
		E[] newElements = (E[]) new Object[newCapacity];
		for(int i = 0;i < size;i++){
			newElements[i]=elements[i];
		}
		elements = newElements;
	}
	private void emptyCheck() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
	}
	
	private void elementNotNullCheck(E element) {
		if(element == null) {
			throw new IllegalArgumentException("element is not null");
		}
	}
	
	@Override
	public Object rootNode() {
		return 0;
	}
	@Override
	public Object leftNode(Object node) {
		//Integer index = (Integer) node;index = (index << 1) + 1;
		int index = ((int) node << 1) + 1;
		return index >= size ? null : index;
	}
	@Override
	public Object rightNode(Object node) {
		int index = ((int) node << 1) + 2;
		return index >= size ? null : index;
	}
	@Override
	public Object string(Object node) {
		//Integer index = (Integer) node;
		return elements[(int)node];
	}
	

}

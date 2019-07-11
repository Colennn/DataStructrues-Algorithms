package DataStructure;

import java.util.Arrays;

/**
 * 主要功能：
 * 1.size()获取数组长度
 * 2.add()往数组的末尾添加一个元素
 * 3.delete()删除数组中的元素
 * 4.get()取出指定位置的元素
 * 5.insert()插入一个元素到指定位置
 * 6.set()替换指定位置的元素
 * 7.search线性查找
 * 8.binarySearch()二分查找法
 * 9.isEmpty()判断是否为空
 * 10.show()打印所有元素到控制台
 * 11.bubbleSort()冒泡排序法
 * @author Administrator
 *
 */
public class Array {
	
	//用于数据存储的数组
	private int[] elements;
	
	public Array() {
		elements = new int[0];
	}
	
	//获取数组长度的方法
	public int size() {
		return elements.length;
	}
	
	//往数组的末尾添加一个元素
	public void add(int element) {
		//创建一个新的数组
		int[] newArr = new int[elements.length+1];
		//把原数组中的元素复制到新数组中
		for(int i = 0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		//把添加的元素放入新数组
		newArr[elements.length] = element;
		//使用新数组替代旧数组
		elements = newArr;
	}
	
	//输出数组中的元素
	public void delete(int index) {
		//判断下标是否越界
		if(index < 0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		//创建一个新数组
		int[] newArr = new int[elements.length-1];
		//复制原有数据到新数组
		for(int i = 0; i < newArr.length; i++) {
			if(i<index) {
				newArr[i] = elements[i];
			}else {
				newArr[i] = elements[i+1];
			}
		}
		//新数组替代旧数组
		elements = newArr;
	}
	
	//取出制定位置的元素
	public int get(int index) {
		//判断下标是否越界
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		return elements[index];
	}
	
	//插入一个元素到指定位置
	public void insert(int index,int element) {
		//创建一个新数组
		int[] newArr = new int[elements.length + 1];
		//将原数组中的元素放入新数组中
		for(int i=0; i<elements.length;i++) {
			if(index>i) {
				newArr[i] = elements[i];
			}else {
				newArr[i+1] = elements[i];
			}
		}
		newArr[index]=element;
		elements=newArr;
		
	}
	//替换指定位置的元素
	public void set(int index,int element) {
		
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		elements[index] = element;
	}
	
	//线性查找
	public int search(int target) {
		//遍历数组
		for(int i = 0;i<elements.length;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		//没有找到对应的元素
		return -1;
	}
	
	//二分查找法
	public int binarySearch(int target) {
		int begin = 0;
		int end = elements.length-1;
		int mid = (begin+end)/2;
		while(true) {
			//什么情况下没有这个元素？
			//开始在结束位置之后或重合，没有这个元素
			if(begin>=end) {
				return -1;
			}
			//判断中间的这个运输是不是要查找的袁术
			if(elements[mid]==target) {
				return mid;
			}else {
				//判断中间的这个袁术是不是比目标元素大
				if(elements[mid]>target) {
					end=mid-1;
				}else {
					begin = mid+1;
				}
				
				mid= (begin+end)/2;
			}
		}
	}
	
	public boolean isEmpty() {
		if(elements == null||elements.length==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	public void bubbleSort() {
		int temp;
		for(int i =0;i<elements.length-1;i++) {
			for(int j =i+1;j<elements.length-1;j++) {
				if(elements[j]>elements[j+1]) {
					temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
	}
}

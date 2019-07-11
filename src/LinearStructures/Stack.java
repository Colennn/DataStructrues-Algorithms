package LinearStructures;

/**
 * 数组作为底层
 * 1.push()压人元素
 * 2.pop()取出栈顶元素
 * 3.peek()查看栈顶元素
 * 4.isEmpty()判断是否为空
 * @author Administrator
 *
 */
public class Stack {
	//栈的底层，我们使用数组来存储数据
	int[] elements;
	
	public Stack() {
		elements = new int[0];
	}
	
	public void push(int element) {
		//创建一个新的数组
		int[] newArr = new int[elements.length + 1];
		//把原数组中的元素复制到新的数组中
		for(int i = 0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		//把添加的元素放入新的数组中
		newArr[elements.length]=element;
		//使用新的数组替换旧数组
		elements=newArr;
	}
	
	public int pop() {
		//栈中没有元素
		if(elements.length==0) {
			throw new RuntimeException("stack is empty");
		}
		//取出数组的最后一个元素
		int element = elements[elements.length-1];
		//创建一个新的数组
		int[] newArr = new int[elements.length-1];		
		//将剩下的元素都放进新数组
		for(int i=0;i<elements.length-1;i++) {
			newArr[i]=elements[i];
		}
		elements=newArr;
		return element;
	}
	
	public int peek() {
		//栈中没有元素
		if(elements.length==0) {
			throw new RuntimeException("stack is empty");
		}
		return elements[elements.length-1];
	}
	
	public boolean isEmpty() {
		return false;
	}
}

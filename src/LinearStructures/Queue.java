package LinearStructures;

/**
 * 数组作为底层
 * 1.add()入队
 * 2.push()出队
 * 3.isEmpty()
 * @author Administrator
 *
 */
public class Queue {
	
	int[] elements;
	
	public Queue() {
		elements=new int[0];
	}
	//入队
	public void add(int element) {
		//创建一个新的数组
		int[] newArr = new int[elements.length+1];
		//复制原数组中的元素到新数组
		for(int i=0;i<newArr.length;i++) {
			newArr[i]=elements[i];
		}
		elements[elements.length]=element;
		elements=newArr;
	}
	//出队
	public int poll() {
		//把数组中的第0个元素取出来
		int element = elements[0];
		//创建一个新的数组
		int[] newArr = new int[elements.length-1];
		//复制原数组中的元素到新数组
		for(int i=0;i<newArr.length;i++) {
			newArr[i]=elements[i+1];
		}
		elements=newArr;
		return element;
	}
	//判断队列是否为空
	public boolean isEmpty() {
		return false;
	}
}

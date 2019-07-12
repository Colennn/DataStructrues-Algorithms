package LinearStructures;

/**
 * 1.after()增加节点
 * 2.next()下一个节点
 * 3.pre()上一个节点
 * 4.getData()获取数据
 * @author Administrator
 *
 */
public class DoubleNode {
	
	//上一个节点?为什么要this
	DoubleNode pre=this;
	//下一个节点
	DoubleNode next=this;
	//节点数据
	int data;
	
	public DoubleNode(int data) {
		this.data=data;
	}
	
	public void after(DoubleNode node) {
		//原来的下一个节点
		DoubleNode newNext = next;
		//把新节点作为当前节点的下一个节点
		this.next=node;
		//把当前节点做新节点的前一个节点
		node.pre=this;
		//让原来的下一个节点作新节点的下一个节点
		node.next=newNext;
		//让原来的下一个节点的上一个节点称为新节点
		newNext.pre=node;
	}
	
	//删除当前节点
	public void remove() {
		if(this.pre==this.next) {
			System.out.println("当前仅有一个节点");
			return;
		}
		//原来的下一个节点
		DoubleNode newNext = next;
		//原来的上一个节点
		DoubleNode newPre = pre;
		
		newNext.pre=newPre;
		newPre.next=newNext;
	}
	
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	
	//获取数据
	public int getData() {
		return this.data;
	}	
	
}

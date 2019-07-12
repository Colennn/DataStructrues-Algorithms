package LinearStructures;

/**
 * 1.after()
 * 2.removeNext()
 * 3.next()
 * 4.getData()
 * @author Administrator
 *
 */
public class LoopNode {
	
	//节点内容
	int data;
	//下一个节点
	LoopNode next=this;
	
	public LoopNode(int data) {
		this.data=data;
	}
	
	//插入一个节点作为当前节点的下一个节点
	public void after(LoopNode node) {
		//取出下一个节点，作为下下个一个节点
		LoopNode nextNext = next;
		//把新节点作为当前节点的下一个节点
		this.next=node;
		//把下下一个节点设置为新节点的下一个节点
		node.next=nextNext;
	}
	
	//删除下一个节点
	public void removeNext() {
		//取出下一个节点，作为下下个一个节点
		LoopNode nextNext = next.next;
		this.next=nextNext;
	}
	
	//获取下一个节点
	public LoopNode next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
}

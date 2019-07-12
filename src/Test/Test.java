package Test;

import LinearStructures.DoubleNode;

public class Test {
	public static void main(String[] args) {
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);

		n1.after(n2);
		n2.after(n3);

		System.out.println(n1.next().getData() + " " + n2.next().getData() + " " + n3.next().getData());
		
		n2.remove();
		System.out.println(n1.next().getData() + " "  + n3.next().getData());
	}

}

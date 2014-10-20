package interview;

public class MidNodeDel {

	public static void main(String[] args) {
		
		int linkedListlength = Integer.parseInt(args[0]);
		
		LinkedListCreate llCreate = new LinkedListCreate();
		Node midNode = llCreate.getMidNode(linkedListlength);
		Node headNode = llCreate.getHeadNode();		
		MidNodeDel midNodeDel = new MidNodeDel();
		midNodeDel.nodeDelete(midNode);
		midNodeDel.displayNodes(headNode);
	}

	public void nodeDelete(Node midNode){
		
		Node currNode = midNode;
		Node nextNode = currNode.getNextNode();
		
		if(midNode==null||nextNode==null){
			System.out.println("Present or next node is null");
		}
		else{
			System.out.println("Node deleted: "+currNode.getData());
			currNode.setData(nextNode.getData());
			currNode.setNextNode(nextNode.getNextNode());
		}		
	}
	
	public void displayNodes(Node headNode){
		
		Node currNode = headNode;
		System.out.println("New linked list");
		while(currNode!=null){
			
			System.out.println(currNode.getData());
			currNode = currNode.getNextNode();
		}
	}
}

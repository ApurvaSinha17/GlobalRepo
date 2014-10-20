package interview;

public class LinkedListCreate {

	int count=20;
	int midNodePosition;
	Node node = new Node();
	Node prevNode;
	Node currNode;
	Node midNode;
	Node headNode;
	
	public Node getHeadNode(){
		return headNode;
	}
	
	public Node getMidNode(int linkedListLength){
		
		if(linkedListLength<=0){
			return null;
		}
		
		node.setData(count);
		node.setNextNode(null);
		headNode = node;
		prevNode = node;
		
		for(int i=2;i<=linkedListLength;i++){
			
			count++;
			currNode = new Node();
			currNode.setData(count);
			currNode.setNextNode(null);
			prevNode.setNextNode(currNode);
			prevNode = currNode;
		}		
		
		//Linked List print
		currNode = node;
		System.out.println("Original Linked List");
		while(currNode!=null){
			
			System.out.println(currNode.getData());
			currNode = currNode.getNextNode();
		}
		
		if(linkedListLength%2==0){
			midNodePosition=linkedListLength/2;
		}
		else{
			midNodePosition=(linkedListLength+1)/2;
		}
		
		int nodeCount = 1;
		currNode = node;
		
		while(currNode!=null){
			
			if(nodeCount==midNodePosition){
				midNode = currNode;
				break;
			}
			else{
				currNode = currNode.getNextNode();
				nodeCount++;
			}
		}
		return midNode;
	}
}


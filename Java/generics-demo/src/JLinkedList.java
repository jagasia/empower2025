
public class JLinkedList<T> {
	private Node<T> start;
	private Node<T> rear;

	public JLinkedList() {
		super();
	}

	public JLinkedList(Node<T> start) {
		super();
		this.start = start;
	}

	public Node<T> getStart() {
		return start;
	}

	public void setStart(Node<T> start) {
		this.start = start;
	}
	
	//add
	public void add(T data) {
		//create a new node and fill the data
		Node<T> node=new Node<>();
		node.setData(data);
		//check if linked list is empty. if yes, start => node
		if(rear == null) {
			start=node;
			rear=node;
		}else
		{
			//already nodes are there. we need to find the last node and append
//			rear.next=node;
			rear.setNext(node);
			rear=node;
		}
	}
	//traverse
	public void traverse() {
		for(Node curr=start;curr!=null;curr=curr.getNext()) {
			System.out.println(curr.getData());
		}
	}
	
}

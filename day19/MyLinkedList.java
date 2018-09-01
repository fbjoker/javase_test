package doufu;

/*
 * 默认LinkedList双向链表，我们设计一个单向的链表
 */
public class MyLinkedList {
	private Node head;
	private int size;
	
	//默认添加到当前链表的最后
	public void add(Object obj){
		//(1)创建新节点
		//把新数据obj封装为一个Node对象，由两部分组成，数据+新节点的下一个节点
		//因为新节点是最后一个节点，因此它的next是null
		Node newNode = new Node(obj, null);
		
		//(2)和原来的节点连接起来
		if(head==null){//当前链表是空的，新节点就是第一个节点
			head = newNode;
		}else{
			//把新节点连接到最后
			Node now = head;
			while(now.next!=null){
				now = now.next;
			}
			
			now.next = newNode;
		}
		//(3)元素个数增加
		size++;
	}
	
	public void remove(Object obj){
		if(head.data.equals(obj)){//要删除的是第一个节点
			//第二个节点变成了第一个节点
			head = head.next;
		}else{
			Node previous = head;
			while(previous.next!=null){
				Node now = previous.next;
				if(now.data.equals(obj)){//now要删除的节点
					//前一个节点的next执行被删除节点next
					previous.next = now.next;
					break;
				}
				previous = now;
			}
		}
		
		size--;
	}
	
	public Object[] toArray(){
		Object[] all = new Object[size];
		Node now = head;
		for (int i = 0; i < all.length; i++) {
			all[i] = now.data;//把节点的数据放到数组中
			now = now.next;
		}
		return all;
	}
	
	public int size(){
		return size;
	}
	
	//结点
	class Node{
		Object data;//记录当前结点的数据
		Node next;//记录当前结点的下一个结点的地址
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}
}

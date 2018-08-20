
//create the interface of simple linked list

public  interface SimpleLinkedList<AnyType> {
	public void insert(AnyType x);
	public AnyType delete();
	public boolean contains(AnyType x);
	public AnyType lookup(AnyType x);
	public boolean isEmpty();
	public void printList();
}

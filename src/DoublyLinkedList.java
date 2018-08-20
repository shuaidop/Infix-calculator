
// to create the interface of the DoudblyLinkedList
public interface DoublyLinkedList<AnyType> {
	public void insert(AnyType x);
    public void printList();
    public AnyType delete();
    public boolean contains(AnyType x);
    public AnyType lookup(AnyType x);
    public boolean isEmpty();
    public void printListRev();
}

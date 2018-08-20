

public class queue<T> implements queueinterface<T> {
    int size=0;
	DLL q;

	queue(){
		q=new DLL();
	}

//the method to see if is empty
	@Override
	public boolean isEmpty() {
		if(q.isEmpty()){
			return true;
			}else{
				return false;
			}
	}
//insert in at the last
	@Override
	public void enqueue(T x) {
		// TODO Auto-generated method stub
		size++;
		q.insert(x);
		
	}
//delete the first one
	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		size--;
		return (T) q.delete();
		
	}
//read the first one
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return (T) q.head.next.data;
	}
	
public double getSize(){
	return size;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	queue q=new queue();
	System.out.println("The list is empty: " + q.isEmpty());
	System.out.println("delet the top "+q.dequeue());
	q.enqueue(1);
	System.out.println("the top is "+q.peek());
	q.enqueue(9);
	System.out.println("the top is "+q.peek());
	q.enqueue(4);
	System.out.println("the top is "+q.peek());
	q.enqueue(5);
	System.out.println("the top is "+q.peek());
	q.enqueue(7);
	System.out.println("the top is "+q.peek());
	q.enqueue("kkkkk");
	System.out.println("The list is empty:" + q.isEmpty());
	System.out.println("the top is "+q.peek());
	System.out.println("delet the top "+q.dequeue());
	System.out.println("the top is "+q.peek());
	System.out.println("delet the top "+q.dequeue());
	System.out.println("the top is "+q.peek());
	System.out.println("delet the top "+q.dequeue());
	System.out.println("the top is "+q.peek());
	System.out.println("delet the top "+q.dequeue());
	System.out.println("the top is "+q.peek());
	System.out.println("The list is empty: " + q.isEmpty());	
}
}

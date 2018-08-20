

//create the interface of queue 
public interface queueinterface<T> {
	 public boolean isEmpty();
     public void enqueue(T x);
     public T dequeue();
     public T peek();
}

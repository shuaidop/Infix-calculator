
public class stack<T> implements stackinterface<T> {
	MyLinkedList list;
	
	public stack(){
		list=new MyLinkedList();
	}
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(list.isEmpty()){
			return true;
			}else{
				return false;
			}
	}
// the method to insert to the first
	@Override
	public void push(T x) {
		// TODO Auto-generated method stub
		list.insert(x);
	}
//the method to delete from the first
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		
        return  (T) list.delete();
      
	}
//to read the first items
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return (T) list.first.data;
	}
	

}

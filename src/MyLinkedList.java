
//create a class of my linked list which implement the simple linked list interface
public class MyLinkedList<AnyType> implements SimpleLinkedList<AnyType>{
	MyNode<AnyType> first;
	
//the constructor
	public MyLinkedList() {
		first = null;
	}
//the method to see if it si empty

	public boolean isEmpty(){
		return(first==null);
		}
	
//the method to insert // the run time is constant

	public  void insert(AnyType x){
//to see if it is empty
		if(isEmpty()){
			first=new MyNode<AnyType>();
			first.data=x;
			first.next=null;
		}
//if it if not empty to see if it is contains the object you want to insert
		else{
			
			MyNode<AnyType> temp=new MyNode<AnyType>();
			temp.data=x;
			temp.next=first;
			first=temp;
		
		}
	}
//print list method  // the run time of the method is n

	public void printList(){
		MyNode k =new MyNode();
		if(first.data==null){
			System.out.println("The list is empty");
		}else{
			MyNode currentnode=first;
			String str= "";
			while(currentnode!=null){
				str+=currentnode.data.toString()+" ";
				currentnode=currentnode.next;
			}
			System.out.println(str);
		}
		
	}
	@Override
//the delete method
	public AnyType delete() {
		// TODO Auto-generated method stub
		
		if(!isEmpty()){
		MyNode k=first;
				first=first.next;
		return (AnyType) k.data;
		}
		else{
			assert first==null:"stack is empty";

			return null;
		}
		
	}
//Contain method
	@Override
	public boolean contains(AnyType x) {
		// TODO Auto-generated method stub
		MyNode k=first;

		while(k!=(null)){

			if(x.equals(k.data)){
				return true;
			}
			k=k.next;
		}
		return false;

	}
	@Override
//the loop up method
	public AnyType lookup(AnyType x) {
		// TODO Auto-generated method stub
		MyNode k=first;
	//enter the while method to check the node you want to find
		while(k!=null){

			if(x.equals(k.data)){
				return x;
			}
			k=k.next;
		}
		return null;
	}


}














































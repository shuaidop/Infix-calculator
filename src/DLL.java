

//write the class for doubly linked list

public class DLL<AnyType> implements DoublyLinkedList<AnyType>{


	public D head= new D();
	public D tail= new D();
	public DLL(){

		head.prev = null;
		head.next = tail;
		tail.prev = head;
		tail.next = null;

	}

//the insert method which use the previous and next to add the object at the end of the list
// the run time of the method is O(constant)
	@Override
	public void insert(AnyType Data) {
		// TODO Auto-generated method stub
		//to see whether if it contains the same element when insert it into the list
			D x=new D();
			x.data= Data;
			x.prev=tail.prev;
			tail.prev.next=x;
			tail.prev=x;
			x.next=tail;
	}

	@Override
	//The delet method

	public AnyType delete() {
		// TODO Auto-generated method stub
		
//enter the while loop and to choose the node which you want to delet
//break the loop if the node you want delet is found
			if(isEmpty()){
				D k=head;
				head.next=tail;
				tail.prev=head;
				return null; 
				
			}
			else{D p=head.next;
				if(head.next.next!=tail){
					head.next=head.next.next;
				}else{
				head.next=tail;
				tail.prev=head;
				}
				return (AnyType) p.data;
			}
	}

	@Override
	//the contain mehtod

	public boolean contains(AnyType x) {
		D k=head;
       //enter the while loop to see the node is in the list or not
		while(k.next.data!=(null)){

			if(x.equals(k.data)){
				return true;
			}
			k=k.next;
		}
		return false;


	}

	@Override
	//loop up method


	public AnyType lookup(AnyType x) {
		// TODO Auto-generated method stub
		D k=head;
//enter the while loop to find the object which you want to search
		while(k.next.data!=null){

			if(x.equals(k.data)){
				return x;
			}
			k=k.next;
		}
		return null;
	}

	@Override
// the empty method

	public boolean isEmpty() {
		//if the head and tail are beside each other
		if(head.next==tail&&tail.prev==head){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	//PrintList reversely method  // the run time is O(n)

	public void printListRev() {
		if (head == null){
			System.out.println("This list is empty");
		}
		else {
			//count up from the last one
			D currentnode=tail.prev;
			String str="";
			while(currentnode.prev!=null){
				str+=currentnode.data.toString()+" ";
				currentnode=currentnode.prev;
			}
			System.out.println(str+head.data);

		}
	}

//print list method // the run time id O(N)

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		//to see if the list is empty or not
		if (head.next.data == null){
			System.out.println("This list is empty");
		}
		else {
			//count down from the head
			D currentnode=head;
			String str= "";
			while(currentnode.data!=null){
				str+=currentnode.data.toString()+" ";
				currentnode=currentnode.next;
			}
			System.out.println(str);

		}

	}





	

}

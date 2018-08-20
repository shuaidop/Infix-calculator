
public class Calculator {
	public static void main(String[] args) {
		stack stack=new stack();
		System.out.println("The list is empty: " + stack.isEmpty());
		System.out.println("delet the top "+stack.pop());
		stack.push(1);
		System.out.println("the top is "+stack.peek());
		stack.push(9);
		System.out.println("the top is "+stack.peek());
		stack.push(4);
		System.out.println("the top is "+stack.peek());
		stack.push(5);
		System.out.println("the top is "+stack.peek());
		stack.push(7);
		System.out.println("the top is "+stack.peek());
		stack.push("kkkkk");
		System.out.println("the top is "+stack.peek());
		System.out.println("delet the top "+stack.pop());
		System.out.println("the top is "+stack.peek());
		System.out.println("delet the top "+stack.pop());
		System.out.println("the top is "+stack.peek());
		System.out.println("delet the top "+stack.pop());
		System.out.println("the top is "+stack.peek());
		System.out.println("delet the top "+stack.pop());
		System.out.println("the top is "+stack.peek());
		System.out.println("The list is empty: " + stack.isEmpty());
	}
}

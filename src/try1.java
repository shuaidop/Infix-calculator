

public class try1 {
//first to create the stack and queue
	queue<String> q=new queue<String>();

	stack<String> s=new stack<String>();


//make a string with spaces to several strings in an array
	public static String[] toString(String k){
		String [] m;
		m=k.split(" ");
		return m;
	}

//the method for shunting-yard
	public queue<String> enter(String[] str){
		s.push("0");

		for(int i=0;i<str.length;i++){
   
			String k=str[i];
			if(k.equals("*")){

				if(s.peek().equals("*")||s.peek().equals("/")|s.peek().equals("%")){
					q.enqueue(s.pop());
					s.push("*");
				}else{
					s.push("*");
				}
			}
			//the mod part for extra credit
			else if(k.equals("%")){
				if(s.peek().equals("*")||s.peek().equals("/")|s.peek().equals("%")){
					q.enqueue(s.pop());
					s.push("%");
				}else{
					s.push("%");
				}
			}
			else if(k.equals("+")){
				if(s.peek().equals("+")||s.peek().equals("-")){
					q.enqueue(s.pop());
					s.push("+");
				}else{
					s.push("+");
				}
			}
			else if(k.equals("-")){
				if(s.peek().equals("-")||s.peek().equals("+")){
					q.enqueue(s.pop());
					s.push("-");
				}else{
					s.push("-");
				}
			}
			else if(k.equals("/")){
				if(s.peek().equals("*")||s.peek().equals("/")|s.peek().equals("%")){
					q.enqueue(s.pop());
					s.push("/");
				}else{
					s.push("/");
				}
			}
			else if(k.equals("(")){
				s.push("(");
			}
			else if(k.equals(")")){
				lookforE(q,"(",s);

			}else if(k.equals("^")){
				s.push("^");
			}else if(k.equals(">")){
				while(!s.peek().equals("0")&&!s.peek().equals("!")&&!s.peek().equals("(")&&!s.peek().equals("|")&&!s.peek().equals("&")){
					q.enqueue(s.pop());
				}
				s.push(">");
			}else if(k.equals("<")){
				while(!s.peek().equals("0")&&!s.peek().equals("!")&&!s.peek().equals("(")&&!s.peek().equals("|")&&!s.peek().equals("&")){
					q.enqueue(s.pop());
				}
				s.push("<");
			}else if(k.equals("=")){
				while(!s.peek().equals("0")&&!s.peek().equals("!")&&!s.peek().equals("(")&&!s.peek().equals("|")&&!s.peek().equals("&")){
					q.enqueue(s.pop());
				}
				s.push("=");
			}else if(k.equals("!")){
				s.push("!");
			}else if(k.equals("&")){
				while(!s.peek().equals("0")){
					q.enqueue(s.pop());
				}
				s.push("&");
			}else if(k.equals("|")){
				while(!s.peek().equals("0")){
					q.enqueue(s.pop());
				}
				s.push("|");
			}
			//the tan sin and cos part for extra credit
			else if(k.equals("sin")){
				s.push("sin");
			}else if(k.equals("cos")){
				s.push("cos");
			}else if(k.equals("tan")){
				s.push("tan");
			}
			else{

				q.enqueue(k);
			}
		}

		while(!s.peek().equals("0")){
			q.enqueue(s.pop());
		}
		return q;
	}

//the look for method when a ( is appear 
	public  Object lookforE(queue q,Object a,stack k){
		if(k.peek().equals(a)){

			k.pop();
			return a;
		}
		else{
			q.enqueue(k.pop());;

			return lookforE(q,a,k);
		}
	}	
	//the method for postfix evaluation
	public Object Q(queue tokens) {  
		try{
		if (tokens.isEmpty())  
			return (double) 0.0;  
		stack<Double> stack=new stack();  
		double p=tokens.getSize();
		for(double i=0.0;i<p;i++){
			String temp=(String) tokens.dequeue();

			if(temp.equals("+")){ 
				double newValue=0;  
				newValue+=stack.pop();  
				newValue+=stack.pop();  

				stack.push(newValue);  
			}else if(temp.equals("-")){  
				double newValue=0;  
				newValue+=stack.pop();  

				newValue-=stack.pop();

				if(newValue==0){
					stack.push(newValue);
				}else{
					stack.push(-newValue);  }
			}else if(temp.equals("*")){  
				double newValue=0;  
				newValue+=stack.pop();  
				newValue*=stack.pop();  
				stack.push(newValue);  
			}else if(temp.equals("/")){  
				//try and catch for the exception which is the extra credit 
				
					double newValue=stack.pop();  
				
				double divided=stack.pop();  
				if (newValue != 0){double outcome=divided/newValue;  
				stack.push(outcome);  
					
				}
				else{
					return "please recheck the input number";
					
				}
			}else if(temp.equals("%")){
				double newValue=stack.pop();
				double mod=stack.pop();
				double outcome=mod%newValue;
				stack.push(outcome);
			}
			else if(temp.equals("^")){
				double newValue=stack.pop();
				double expo= stack.pop();
				double outcome=Math.pow(expo,newValue);
				stack.push(outcome);
			}else if(temp.equals("<")){
				double Value2=stack.pop();
				double Value1=stack.pop();

				if(Value1<Value2){
					stack.push(1.0);
				}else{
					stack.push(0.0);
				}
			}else if(temp.equals(">")){
				double Value2=stack.pop();
				double Value1=stack.pop();
				if(Value1>Value2){
					stack.push(1.0);
				}else{
					stack.push(0.0);
				}
			}else if(temp.equals("=")){
				double Value2=stack.pop();
				double Value1=stack.pop();
				if(Value1==Value2){
					stack.push(1.0);
				}else{
					stack.push(0.0);
				}
			}else if(temp.equals("!")){
				if(stack.pop()==1){
					stack.push(0.0);
				}else{
					stack.push(1.0);
				}
			}else if(temp.equals("|")){
				double Value1=stack.pop();
				double Value2=stack.pop();
				if(Value1==Value2){
					stack.push(Value1);
				}else{
					stack.push(1.0);
				}
			}else if(temp.equals("&")){
				double Value1=stack.pop();
				double Value2=stack.pop();
				if(Value1==Value2){
					stack.push(Value1);
				}else{
					stack.push(0.0);
				}
			}else if(temp.equals("sin")){
				double outcome=Math.sin(stack.pop());
				stack.push(outcome);
			}else if(temp.equals("cos")){
				double outcome=Math.cos(stack.pop());
				stack.push(outcome);
			}else if(temp.equals("tan")){
				double outcome=Math.tan(stack.pop());
				stack.push(outcome);
			}

			else {  
				Double value=Double.parseDouble(temp);  
				stack.push(value);  
			}
		}  
		return stack.pop(); 

	}  //the check for null pointer exception
		catch(NullPointerException e){
			return "The item in the stack is null please check the number you entered";
		}
	}
}

package com.datastructures;

public class StackOperations implements Stack{
	
	private int top = -1;
	private Object[] stack  ;
	
	public StackOperations(){
		stack = new Object[10];
	}
	
	public StackOperations(int capacity){
		stack = new Object[capacity];
	}
	
	@Override
	public void push(Object element) throws Exception {
		// TODO Auto-generated method stub
		if(top == stack.length - 1)
			throw new Exception("Stack is Full, capacity of Stack is " + stack.length);
		
		stack[++top] = element;

	}

	@Override
	public Object pop() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new Exception("Stack is Empty");
		return stack[top--];
	}

	@Override
	public Object findTop() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new Exception("Stack is Empty");
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top == -1)
			return true;
		return false;
	}
	
	public Object[] getStack(){		
		return stack;
	}

}

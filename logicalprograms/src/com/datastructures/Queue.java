package com.datastructures;

public interface Queue {
	
	public void enqueue(Object element)throws Exception;
	public Object dequeue()throws Exception;
	public boolean isEmpty();
	public Object peek()throws Exception;

}

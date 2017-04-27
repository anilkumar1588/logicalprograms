package com.datastructures;

public interface Stack {
	
	public void push(Object element)throws Exception;
	public Object pop()throws Exception;
	public Object findTop()throws Exception;
	public boolean isEmpty();

}

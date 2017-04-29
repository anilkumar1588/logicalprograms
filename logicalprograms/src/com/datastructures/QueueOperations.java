package com.datastructures;

public class QueueOperations implements Queue {
	
	private int frontIndex = -1;
	private int rearIndex = -1;
	private Object[] queue;
	
	public QueueOperations(){
		queue = new Object[3];
	}
	
	public QueueOperations(int capacity){
		queue = new Object[capacity];
	}

	@Override
	public void enqueue(Object element) throws Exception {
		// TODO Auto-generated method stub
		if( rearIndex == queue.length - 1)
			throw new Exception("Queue is Full, capacity of queue is "+ queue.length);
		
		if(isEmpty())
			frontIndex++;
			
			queue[++rearIndex] = element;

	}

	@Override
	public Object dequeue() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new Exception("Queue is empty");
		if(frontIndex > rearIndex)
			throw new Exception("No Elements in Queue : memory occupied");
		
		return queue[frontIndex++];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(frontIndex == -1 && rearIndex == -1)
			return true;
		
		return false;
	}

	@Override
	public Object peek() throws Exception{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new Exception("Queue is empty");
		if(frontIndex > rearIndex)
			throw new Exception("No Elements in Queue: memory occupied");
		return queue[frontIndex];
	}

}

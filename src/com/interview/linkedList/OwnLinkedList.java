package com.interview.linkedList;

public class OwnLinkedList {
	protected Node start;
	protected Node end;
	public int size;
	
	 public OwnLinkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	 
	 public boolean isEmpty()
	    {
	        return start == null;
	    }
	 
	  public int getSize()
	    {
	        return size;
	    } 
	  
	  
}

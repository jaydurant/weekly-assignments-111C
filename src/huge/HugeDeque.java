package huge;


public class HugeDeque<T> implements HugeDequeInterface<T>
{
	private Node firstNode;
	private Node lastNode;
	
	public HugeDeque()
	{
		firstNode = null;
		lastNode = null;
	}
	
	public void addToFront(T newEntry)
	{
		Node nextNode = firstNode;
		firstNode = new Node(newEntry);
		if (isEmpty())
		{
			lastNode = firstNode;
		}
		else
		{
			firstNode.next = nextNode;
		}
	}
	
	public void addToBack(T newEntry)
	{
	     Node newNode = new Node(newEntry, null);
	     if(isEmpty())
	     {
	    	 	firstNode = newNode;
	    	 	lastNode = firstNode;
	     }
	     else
	     {	    	 	 
	    	 	lastNode.setNextNode(newNode);
	     }
	     lastNode = newNode;
	}
	
	public T removeFront()
	{
		T front = getFront();
        assert firstNode != null;
        firstNode.setData(null);
        firstNode = firstNode.getNextNode();
        if(firstNode == null)
        lastNode = null;

        return front;
	}
	
	public T removeBack()
	{
		T back = getBack();
        lastNode.setData(null);
        Node thisNode = firstNode;
        while (thisNode != null) 
        {
          if (lastNode.equals(thisNode.next)) 
          {
            thisNode.next = null;
            lastNode = thisNode;
            break;
          }
          thisNode = thisNode.next;
        }
        return back;
	}
	
	public T getFront()
	{
		if (isEmpty())
		{
			return null;
		}
		else
		{
			return firstNode.getData();
		}
	}
	
	public T getBack()
	{
		if (isEmpty())
		{
			return null;
		}
		else
		{
			return lastNode.getData();
		}
	}
	
	public boolean isEmpty() 
	{
		return (firstNode == null) || (lastNode == null);
	}

	public void clear() 
	{
		firstNode = null;
        lastNode = null;
	}
	 private class Node
     {
             private T data;
             private Node next;

             private Node(T dataPortion)
             {
                     this(dataPortion, null);
             }

             private Node(T dataPortion, Node nextNode)
             {
                     data = dataPortion;
                     next = nextNode;
             }

             private T getData()
             {
                     return data;
             }

             private void setData(T dataPortion)
             {
                     data = dataPortion;
             }

             private Node getNextNode()
             {
                     return next;
             }

             private void setNextNode(Node nextNode)
             {
                     next = nextNode;
             }
     }
}


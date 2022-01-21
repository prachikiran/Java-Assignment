
public class Queue {
	
	    private int[] array; 
	    private int front;
	    private int rear;
	    private int capacity;
	    private int count; 
	 

	    Queue(int size)
	    {
	        array = new int[size];
	        capacity = size;
	        front = 0;
	        rear = -1;
	        count = 0;
	    }
	 
	    public int dequeue()
	    {

	        if (isEmpty())
	        {
	            System.out.println("Underflow\nProgram Terminated");
	            System.exit(-1);
	        }
	 
	        int x = array[front];
	 
	        System.out.println("Removing " + x);
	 
	        front = (front + 1) % capacity;
	        count--;
	 
	        return x;
	    }

	    public void enqueue(int item)
	    {

	        if (isFull())
	        {
	            System.out.println("Overflow\nProgram Terminated");
	            System.exit(-1);
	        }
	 
	        System.out.println("Inserting " + item);
	 
	        rear = (rear + 1) % capacity;
	        array[rear] = item;
	        count++;
	    }
	    
	    public int peek()
	    {
	        if (isEmpty())
	        {
	            System.out.println("Underflow\nProgram Terminated");
	            System.exit(-1);
	        }
	        return array[front];
	    }

	    public int size() {
	        return count;
	    }

	    public boolean isEmpty() {
	        return (size() == 0);
	    }
	 
	    public boolean isFull() {
	        return (size() == capacity);
	    }
	}
	 
	class Main
	{
	    public static void main (String[] args)
	    {
	        Queue q = new Queue(5);
	 
	        q.enqueue(1);
	        q.enqueue(0);
	        q.enqueue(4);
	 
	        System.out.println("The front element is " + q.peek());
	        q.dequeue();
	        System.out.println("The front element is " + q.peek());
	 
	        System.out.println("The queue size is " + q.size());
	 
	        q.dequeue();
	        q.dequeue();
	 
	        if (q.isEmpty()) {
	            System.out.println("The queue is empty");
	        }
	        else {
	            System.out.println("The queue is not empty");
	        }
	    }
	}

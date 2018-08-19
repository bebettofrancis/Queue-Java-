class Queue {
	static final int MAX = 5;
	int a[] = new int[100];
	int front, rear;
	
	Queue () {
		front=rear = -1;
	}
	
	boolean enqueue(int x) {
		if(rear>=MAX) {
			System.out.println("Queue Overflow!");
			return false;
		}
		
		else {
			a[++rear] = x;
			return true;
		}
	}
	
	int dequeue() {
		if(front == rear) {
			System.out.println("Queue Underflow!");
			return 0;
		}
		
		else {
			int x = a[++front];
			return x;
		}
	}
}

class QueueDemo {
	public static void main(String args[]) {
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(90);
		q.enqueue(50);
		q.enqueue(20);
		q.enqueue(40);
		
		System.out.println(q.dequeue()+" dequeued");
	}
}
			
	
class Queue {
	char q[]; //this array holds the queue
	int putloc,getloc; //the put and get indices
	
	Queue(int size) {
		q=new char[size]; //allocate memory for the queue
		putloc=getloc=0;
	}
	
	//put a character into the queue
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	//get a character from the queue
	char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
}

class QueueTest {
	public static void main(String args[]) {
		Queue bigQ = new Queue(50);
		Queue smallQ = new Queue(4);
		
		char ch;
		int i;
		
		System.out.println("Using bigQ to sort the Alphabets.\n");
		
		for(i=0;i<26;i++) 
			bigQ.put((char)('A'+i));
			
		System.out.print("Contents of bigQ: ");
		for(i=0;i<26;i++) {
			ch=bigQ.get();
			if(ch!=(char) 0)
				System.out.print(ch);
		}

		System.out.println("\n");

		//Using smallQ to generate errors

		for(i=0;i<5;i++) {
			System.out.print("Attempting to store "+(char)('Z'-i));
			smallQ.put((char)('Z'-i));
			System.out.println();			
		}
		
		System.out.println();
		
		System.out.print("Contents of smallQ: ");
		
		for(i=0;i<5;i++) {
			ch=smallQ.get();
			
			if(ch!=(char)0)
				System.out.print(ch);			
		}		
		
	}
}
			
			

		
		
		







		
		
	
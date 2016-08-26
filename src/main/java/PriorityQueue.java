public class PriorityQueue implements PriorityQueueI {

    private int[] queue;
    private int numQueueItems;
    
    public PriorityQueue() {
	this(50);
    }

    public PriorityQueue(int size) {
	queue = int[size];
	numQueueItems = 0;
    }
    
    
    public void insert(int priority) {

	for ( int hole = ++numQueueItems; hole > 1 && priority > queue[hole / 2]; hole /= 2 ) {
	    queue[hole] = queue[hole / 2];
	}

	queue[hole] = priority;
	
    }

    public int getMax() {

    }

}

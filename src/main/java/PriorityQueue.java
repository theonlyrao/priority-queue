public class PriorityQueue implements PriorityQueueI {

    private int[] queue;
    private int numQueueItems;
    
    public PriorityQueue() {
	this(50);
    }

    public PriorityQueue(int size) {
	queue = new int[size];
	numQueueItems = 0;
    }
    
    
    public void insert(int priority) {
	int hole = ++numQueueItems;
	
	for ( ; hole > 1 && priority > queue[hole / 2]; hole /= 2 ) {
	    queue[hole] = queue[hole / 2];
	}

	queue[hole] = priority;
	
    }

    public int getMax() {
	int max = queue[1];
	int maxChild;
	queue[1] = queue[numQueueItems--];

	int i;
	int child;
	for ( i = 1; i * 2 <= numQueueItems; i = i * 2 ) {
	    if ( queue[i * 2] > queue[(i * 2) + 1]) {
		child = i * 2;
	    } else {
		child = (i * 2) + 1;
	    }
	    maxChild = queue[child];
	    
	    if (child > queue[i]) {
		queue[child] = queue[i];
		queue[i] = maxChild;
	    } else {
		break;
	    }
	}

	return max;
	
    }
}

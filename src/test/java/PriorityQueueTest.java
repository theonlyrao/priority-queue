import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityQueueTest {
    @Test public void insertAndGetMaxWithOneItem() {
	PriorityQueue queue = new PriorityQueue();
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(1, max);
    }

    @Test public void insertAndGetMaxWithTwoItems() {
	PriorityQueue queue = new PriorityQueue();
	queue.insert(2);
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(2, max);
    }

    @Test public void insertAndGetMaxWithUnorderedItems() {
	PriorityQueue queue = new PriorityQueue();
	queue.insert(8);
	queue.insert(153);
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(153, max);
    }

    @Test public void insertAndGetMaxWithMultipleInsertionsAndRetrievals() {
	PriorityQueue queue = new PriorityQueue();
	queue.insert(5);
	queue.insert(1);
	queue.getMax();
	queue.insert(3);
	int max = queue.getMax();	
	assertEquals(3, max);
    }
    
}
